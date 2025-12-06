#
# Shared recipes for projects
#

set working-directory := "{{invocation_directory()}}"

ktlint := require("ktlint")

# run ktlint
[no-cd]
[group("Check")]
ktlint:
  {{ktlint}} --code-style=intellij_idea


# Open the project in Intellij IDEA
[group("Open")]
open-amper-project:
  idea .


# generate editorconfig text with the intellij default kotlin style
[group("Generate")]
generate-editorconfig:
  @ktlint generateEditorConfig --code-style=intellij_idea

#Open Projects
#[group("Open")]
#open-projects: open-amper-project open-gradle-project
