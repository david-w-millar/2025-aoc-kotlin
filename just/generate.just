#
# Generate Things
#

# TODO: move to shared project justfile

ktlint := require("ktlint")

# generate editorconfig text with the intellij default kotlin style
[group("Generate")]
generate-editorconfig:
  @ktlint generateEditorConfig --code-style=intellij_idea
