#
# Shared recipes for projects
#

ktlint := require("ktlint")

# run ktlint
[no-cd]
[group("Check")]
ktlint:
  {{ktlint}} --code-style=intellij_idea


# Open the project in Intellij IDEA
[group("Open")]
open:
  idea .


# generate editorconfig text with the intellij default kotlin style
[group("Misc")]
generate-editorconfig:
  @ktlint generateEditorConfig --code-style=intellij_idea
