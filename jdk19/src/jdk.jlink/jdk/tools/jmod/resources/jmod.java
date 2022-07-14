package jdk.tools.jmod.resources;

import java.util.ListResourceBundle;

public final class jmod extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.bad.WarnIfResolvedReason", "bad reason: {0}, must be one of deprecated, deprecated-for-removal, or incubating" },
            { "err.bad.pattern", "bad pattern {0}" },
            { "err.cannot.create.dir", "cannot create directory {0}" },
            { "err.classpath.must.be.specified", "--class-path must be specified" },
            { "err.date.out.of.range", "--date {0} is out of the valid range 1980-01-01T00:00:02Z to 2099-12-31T23:59:59Z" },
            { "err.file.already.exists", "file already exists: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.class.path.entry", "invalid class path entry: {0}" },
            { "err.invalid.date", "--date {0} is not a valid ISO-8601 extended offset date-time with optional time-zone format: {1}" },
            { "err.invalid.dryrun.option", "--dry-run can only be used with hash mode" },
            { "err.invalid.main-class", "invalid main-class name: {0}" },
            { "err.invalid.mode", "mode must be one of create, extract, list, describe, or hash: {0}" },
            { "err.invalid.version", "invalid module version {0}" },
            { "err.jmod.must.be.specified", "jmod-file must be specified" },
            { "err.jmod.not.found", "no jmod file found: {0}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.missing.export.or.open.packages", "Packages that are exported or open in {0} are not present: {1}" },
            { "err.missing.mode", "one of create, extract, list, describe, or hash must be specified" },
            { "err.mods.must.be.specified", "--mods must be specified" },
            { "err.module.descriptor.not.found", "Module descriptor not found" },
            { "err.module.resolution.fail", "Resolution failed: {0}" },
            { "err.modulepath.must.be.specified", "--module-path must be specified when hashing modules" },
            { "err.no.moduleToHash", "No hashes recorded: no module matching {0} found to record hashes" },
            { "err.output.must.be.specified", "--output must be specified" },
            { "err.path.not.a.dir", "path must be a directory: {0}" },
            { "err.path.not.found", "path not found: {0}" },
            { "err.path.not.valid", "invalid path: {0}" },
            { "err.unknown.option", "unknown option(s): {0}" },
            { "error.prefix", "Error:" },
            { "jmod.description", "create JMOD files and list the content of existing JMOD files" },
            { "main.opt.class-path", "Application jar files|dir containing classes" },
            { "main.opt.cmdfile", "Read options from the specified file" },
            { "main.opt.cmds", "Location of native commands" },
            { "main.opt.config", "Location of user-editable config files" },
            { "main.opt.date", "Date and time for the timestamps of entries, specified in ISO-8601 extended offset date-time with optional time-zone format, e.g. \"2022-02-12T12:30:00-05:00\"" },
            { "main.opt.do-not-resolve-by-default", "Exclude from the default root set of modules" },
            { "main.opt.dry-run", "Dry run of hash mode" },
            { "main.opt.exclude", "Exclude files matching the supplied comma separated pattern list, each element using one the following forms: <glob-pattern>, glob:<glob-pattern> or regex:<regex-pattern>" },
            { "main.opt.extractDir", "Target directory for extract" },
            { "main.opt.hash-modules", "Compute and record hashes to tie a packaged module with modules matching the given <regex-pattern> and depending upon it directly or indirectly. The hashes are recorded in the JMOD file being created, or a JMOD file or modular JAR on the module path specified the jmod hash command." },
            { "main.opt.header-files", "Location of header files" },
            { "main.opt.help", "Print this help message" },
            { "main.opt.help-extra", "Print help on extra options" },
            { "main.opt.legal-notices", "Location of legal notices" },
            { "main.opt.libs", "Location of native libraries" },
            { "main.opt.main-class", "Main class" },
            { "main.opt.main-class.arg", "class-name" },
            { "main.opt.man-pages", "Location of man pages" },
            { "main.opt.mode", "Main operation modes:" },
            { "main.opt.mode.create", "create    - Creates a new jmod archive" },
            { "main.opt.mode.describe", "describe  - Prints the module details" },
            { "main.opt.mode.extract", "extract   - Extracts all the files from the archive" },
            { "main.opt.mode.hash", "hash      - Records hashes of tied modules." },
            { "main.opt.mode.list", "list      - Prints the names of all the entries" },
            { "main.opt.module-path", "Module path" },
            { "main.opt.module-version", "Module version" },
            { "main.opt.target-platform", "Target platform" },
            { "main.opt.target-platform.arg", "target-platform" },
            { "main.opt.version", "Version information" },
            { "main.opt.warn-if-resolved", "Hint for a tool to issue a warning if the module is resolved. One of deprecated, deprecated-for-removal, or incubating" },
            { "main.usage", "Usage: {0} (create|extract|list|describe|hash) <OPTIONS> <jmod-file>\n" },
            { "main.usage.summary", "Usage: {0} (create|extract|list|describe|hash) <OPTIONS> <jmod-file>\nuse --help for a list of possible options" },
            { "module.hashes.recorded", "Hashes are recorded in module {0}" },
            { "warn.ignore.duplicate.entry", "ignoring duplicate entry {0}, in section {1}" },
            { "warn.ignore.entry", "ignoring entry {0}, in section {1}" },
            { "warn.invalid.arg", "Invalid classname or pathname not exist: {0}" },
            { "warn.no.module.hashes", "No hashes recorded: no module specified for hashing depends on {0}" },
            { "warn.prefix", "Warning:" },
        };
    }
}
