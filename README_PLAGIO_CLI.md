# Plagio CLI

## Usage

Open your terminal where `plagio-cli.exe` is downloaded and run `./plagio-cli help` command to see list of options:

```
Usage: plagio-cli [options] [command]


 ______  _              _
(_____ \| |            (_)
 _____) ) | _____  ____ _  ___
|  ____/| |(____ |/ _  | |/ _ \
| |     | |/ ___ ( (_| | | |_| |
|_|      \_)_____|\___ |_|\___/
                 (_____|

Code Plagiarism Detection using ANTLR4 and Damerau-Levenshtein Distance Algorithm

Options:
  -V, --version                output the version number
  -h, --help                   display help for command

Commands:
  detect [options] <path>        Perform Plagiarism Detection in a Directory
  detect-files [options] <path>  Perform Plagiarism Detection of 2 Files
  help [command]               display help for command
```

To see detail options on spesific command, use `plagio-cli help <command>`. For example, if you run `plagio-cli help detect` command, you will see the following:

```
Usage: plagio-cli detect [options] <path>

Perform Plagiarism Detection in a Directory

Arguments:
  path                          Path to Directory

Options:
  -al --algorithm [algorithm]   Algorithm to perform plagiarism detection. Currently only Damerau-Levenshtein Distance. (default: "damerau")
  -ext --extension [extension]  File Extension to search for. (default: ".java")
  -r, --recursive [recursive]   Recursively search in subdirectories (default: false)
  -m, --max-files [maxFiles]    Maximum number of files to search for.
  -o --output [outputName]      Output file name. (default: "result")
  --output-dir [outputDir]      Output directory
  --output-ext [outputExt]      Output extension (default: ".html")
  -h, --help                    display help for command
```

## Examples

To detect plagiarism in `./data/generated` directory, run the following command:

```
./plagio-cli detect ./data/generated
```

It will save the result output in `result.html`. If options `--output-dir` is not provided, the output file will be opened in the browser and saved automatically in the directory where plagiarism detection is performed, in this case at `./data/generated/result.html`.

If you want to:

- Perform plagiarism to maximum of 20 files
- Save result with name "similarity"
- Save result at the current directory
- Save result as CSV file
  You can run the command as follows:

```
./plagio-cli detect ./data/generated --m=20 -o=similarity --output-dir=. --output-ext=.csv
```
