# 2025-AOC-Kotlin

Kotlin solutions to the 2025 [Advent of Code](https://adventofcode.com/) programming puzzles.
Bootstrapped with gihub templates for gradle and kotlin projects.

**Build Tools:** I'm jumping around between amper and gradle builds,
and am mostly focusing on experimenting with language and build features here.

**Dev Environments:** I'm working in Intellij IDEA, vim, and the command line,
so I've tried to make each experience ergonomic.

[!NOTE]
This is not the type of code or project that is indicative of
what I would normally produce outside the context of a programming challenge, or set of puzzles.


## Project Notes

See the [Amper](amper-project/README.md) and [Gradle](gradle-project/README.md)
for more information about the respective projects.

I'm using the [Just Command Line Runner](https://just.systems/) to coordinate most things here.
There are some macOS specific commands scattered around, and a few tools like
[kdoctor](https://github.com/Kotlin/kdoctor),
[figlet](https://www.figlet.org/),
and [ktlint](https://pinterest.github.io/ktlint/latest/)
that are required for certain things to work properly.



## Getting Started

```shell
$ just

  :::.         ...       .,-:::::      .:::.            .:::. ::::::::
  ;;`;;     .;;;;;;;.  ,;;;'````'     ,;'``;.   ,;;,   ,;'``;.`;;``'';
 ,[[ '[[,  ,[[     \[[,[[[            ''  ,[[',['  [n  ''  ,[['[[,_   
c$$$cc$$$c $$$,     $$$$$$            .c$$P'  $$    $$ .c$$P'  `""*Ycc
 888   888,"888,_ _,88P`88bo,__,o,   d88 _,oo,Y8,  ,8"d88 _,oo,__,od8"
 YMM   ""`   "YMMMMMP"   "YUMMMMMP"  MMMUP*"^^ "YmmP  MMMUP*"^^MMP"   


Available recipes:
    [Docs]
    docs-build-tools      # open build tool docs
    docs-kotlin           # Open AOC related sites
    docs-libs             # Open libs, plugins, etc related sites
    docs-misc             # Open Devdocs.io in the default browser

    [Git]
    github-info           # Github Info
    github-web            # Github Info

    [Lint]
    format-justfiles      # Format justfiles

    [Project Misc]
    generate-editorconfig # Create an editorconfig file with the default intellij kotlin style
    preflight-checks      # Verify that we're ready to rock KMP should we want to

    [Sites]
    aoc-sites             # Open all the sites!
```


## TODO?

* [ ] Collapse the justfiles?
* [ ] Solve a damn puzzle
* [ ] Power Asserts
* [ ] Benchmarking
* [ ] Amper project - separate modules per day
* [ ] Gradle project - separate modules per day
* [ ] Introduce detekt, remove any standalone ktlint artifacts
* [ ] Tune build caches
* [ ] wathexec, run tests on change, or something similar to run code on changes, hopefully intelligently
* [ ] shared example and actual puzzle input
* [ ] Look into ways to use the same source sets with both build tools.  That might get weird.

* [ ] Meh
  * [ ] ktlint format - just recipes, git hooks, ¯\_(ツ)_/¯

* [ ] Maybe
  * [ ] mordant - for terminal visualization?
  * [ ] clikt
  * [ ] notebooks
  * [ ] automate pulling in example and actual problem input
  * [ ] pre-commit hooks - quality, linting, security, etc
  * [ ] pre-commit hooks - commit name conventions?
  * [ ] automate commit names?

