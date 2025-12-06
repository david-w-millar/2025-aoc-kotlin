#
# Static Analysis and Linting
#

# set working-directory := "{{justfile_directory()}}"

ktlint := require("ktlint")

# kotlin-stdlib
[group("Check")]
ktlint:
  {{ktlint}} --help
  

# generate editorconfig text with the intellij default kotlin style
[group("Generate")]
generate-editorconfig:
  @ktlint generateEditorConfig --code-style=intellij_idea
