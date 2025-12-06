#!/usr/bin/env just --justfile
#
# A command runner
# https://just.systems
#
# --- Config ---

set dotenv-load := true

# load values from .env files

set export := true

# export variables for consumption by sub-processes

set unstable := true

# --- Aliases ---
# TODO: to come later...

[private]
default:
    @figlet -f cosmic "AoC 2025"
    @echo "\n"
    @just --quiet --list --list-submodules

# Verify that we're ready to rock KMP should we want to
[group("Project Misc")]
[macos]
preflight-checks:
    pushd "{{ invocation_dir() }}"
    kdoctor --all --verbose
    popd

# TODO: Move these to a justfile for common operations on both projects

# Create an editorconfig file with the default intellij kotlin style
[group("Project Misc")]
generate-editorconfig:
    @echo "{{ BOLD }}{{ GREEN }}::: Generating amper-project/.editorconfig {{ NORMAL }}"
    @ktlint generateEditorConfig --code-style=intellij_idea | tee amper-project/.editorconfig

    @echo "\n{{ BOLD }}{{ GREEN }}::: Generating gradle-project/.editorconfig {{ NORMAL }}"
    @ktlint generateEditorConfig --code-style=intellij_idea | tee gradle-project/.editorconfig

# Open all the sites!
[group("Sites")]
aoc-sites:
    open https://adventofcode.com
    open https://github.com/david-w-millar
    open https://kotlinlang.org/docs/home.html
    open https://amper.org/latest/
    open https://docs.gradle.org/current/userguide/userguide.html
    open https://kotlinlang.org/docs/gradle.html
    open https://just.systems/man/en/
    #open https://github.com/kotlin-hands-on/advent-of-code-kotlin-template/issues
    #open https://github.com/kotlin-hands-on/advent-of-code-kotlin-template

# Open AOC related sites
[group("Docs")]
docs-kotlin:
    open https://kotlinlang.org/docs/home.html
    open https://kotlinlang.org/docs/api-references.html
    open https://kotlinlang.org/api/core/kotlin-stdlib/

# Open libs, plugins, etc related sites
[group("Docs")]
docs-libs:
    open https://klibs.io/
    open https://plugins.gradle.org/

# open build tool docs
[group("Docs")]
docs-build-tools:
    open https://docs.gradle.org/current/userguide/userguide.html
    open https://amper.org/latest/

# Open Devdocs.io in the default browser
[group("Docs")]
docs-misc:
    open https://devdocs.io/

# Format justfiles
[group("Lint")]
format-justfiles:
    @just --fmt
