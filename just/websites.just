# --- Docs Just Module ---

#
# Open Docs / Other Websites
#

# set working-directory := "{{justfile_directory()}}"

# list recipes
default-websites:
  @just --list --justfile "{{justfile()}}"


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
