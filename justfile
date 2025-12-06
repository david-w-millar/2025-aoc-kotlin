#!/usr/bin/env just --justfile

#
# A command runner
# https://just.systems
#

# --- Config ---
set dotenv-load # load values from .env files
set export      # export variables for consumption by sub-processes

# --- Mods ---

# Open websites
mod sites "just/websites.just"


# --- Aliases ---

# TODO: to come later...



[private]
default:
    @figlet -f cosmic "AoC 2025"
    @echo "\n"
    @just --quiet --list --list-submodules


# Verify that we're ready to rock KMP should we want to
[macos]
[group("Project Misc")]
preflight-checks:
  pushd "{{invocation_dir()}}"
  kdoctor --all --verbose
  popd


# TODO: Move these to a justfile for common operations on both projects


# Create an editorconfig file with the default intellij kotlin style
[group("Project Misc")]
generate-editorconfig:
  @echo "{{BOLD}}{{GREEN }}::: Generating amper-project/.editorconfig {{ NORMAL }}"
  @ktlint generateEditorConfig --code-style=intellij_idea | tee amper-project/.editorconfig

  @echo "\n{{BOLD}}{{GREEN }}::: Generating gradle-project/.editorconfig {{ NORMAL }}"
  @ktlint generateEditorConfig --code-style=intellij_idea | tee gradle-project/.editorconfig


# Open amper project in Intellij
[group("Open")]
open-amper-project:
  cd amper-project && idea .

# Open gradle project in Intellij
[group("Open")]
open-gradle-project:
  cd gradle-project && idea .

# Open Projects
[group("Open")]
open-projects: open-amper-project open-gradle-project
