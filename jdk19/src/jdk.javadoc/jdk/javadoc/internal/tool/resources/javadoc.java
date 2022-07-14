package jdk.javadoc.internal.tool.resources;

public final class javadoc extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "doclet.internal.report.bug", "Please file a bug against the javadoc tool via the Java bug reporting page\n(http://bugreport.java.com) after checking the Bug Database (http://bugs.java.com)\nfor duplicates. Include error messages and the following diagnostic in your report. Thank you." },
            { "javadoc.class_not_found", "Class {0} not found." },
            { "javadoc.description", "generate HTML pages of API documentation from Java source files" },
            { "javadoc.err.message", "{0}" },
            { "javadoc.error.msg", "{0}: error - {1}" },
            { "javadoc.fullversion", "{0} full version \"{1}\"" },
            { "javadoc.note.message", "{0}" },
            { "javadoc.note.msg", "{1}" },
            { "javadoc.note.pos.msg", "{0}: {1}" },
            { "javadoc.version", "{0} {1}" },
            { "javadoc.warn.message", "{0}" },
            { "javadoc.warning.msg", "{0}: warning - {1}" },
            { "main.Building_tree", "Constructing Javadoc information..." },
            { "main.Loading_source_file", "Loading source file {0}..." },
            { "main.Loading_source_files_for_package", "Loading source files for package {0}..." },
            { "main.No_modules_packages_or_classes_specified", "No modules, packages or classes specified." },
            { "main.Xusage", "" },
            { "main.Xusage.foot", "\nThese options are non-standard and subject to change without notice." },
            { "main.assertion.error", "assertion failed: \"{0}\"" },
            { "main.bad.arg.for.filemanager.option", "bad value for file manager option {0}: \"{1}\"" },
            { "main.cannot_use_sourcepath_for_modules", "cannot use source path for multiple modules {0}" },
            { "main.cant.read", "cannot read {0}" },
            { "main.could_not_instantiate_class", "Could not instantiate class {0}" },
            { "main.doclet.usage.header", "\nProvided by the {0} doclet:" },
            { "main.doclet_class_not_found", "Cannot find doclet class {0}" },
            { "main.doclet_could_not_get_location", "Could not get location for {0}" },
            { "main.doclet_could_not_set_location", "Could not set location for {0}" },
            { "main.doclet_no_classloader_found", "Could not obtain classloader to load {0}" },
            { "main.done_in", "[done in {0} ms]" },
            { "main.error", "{0} error" },
            { "main.errors", "{0} errors" },
            { "main.fatal.error", "fatal error encountered: {0}" },
            { "main.file.manager.list", "FileManager error listing files: \"{0}\"" },
            { "main.file_not_found", "File not found: \"{0}\"" },
            { "main.illegal_class_name", "Illegal class name: \"{0}\"" },
            { "main.illegal_option_value", "Illegal option value: \"{0}\"" },
            { "main.illegal_package_name", "Illegal package name: \"{0}\"" },
            { "main.internal.error", "an internal error has occurred" },
            { "main.invalid_flag", "invalid flag: {0}" },
            { "main.malformed_locale_name", "Malformed locale name: {0}" },
            { "main.module_not_found", "module {0} not found" },
            { "main.module_not_found_on_sourcepath", "module {0} not found on source path" },
            { "main.module_source_not_found", "source files for module {0} not found" },
            { "main.more_than_one_doclet_specified_0_and_1", "More than one doclet specified ({0} and {1})." },
            { "main.no_source_files_for_package", "No source files for package {0}" },
            { "main.not_a_doclet", "Class {0} is not a valid doclet.\nNote: As of JDK 13, the com.sun.javadoc API is no longer supported." },
            { "main.only_one_argument_with_equals", "cannot use ''='' syntax for options that require multiple arguments" },
            { "main.opt.J.arg", "<flag>" },
            { "main.opt.J.desc", "Pass <flag> directly to the runtime system" },
            { "main.opt.Werror.desc", "Report an error if any warnings occur" },
            { "main.opt.Xmaxerrs.arg", "<number>" },
            { "main.opt.Xmaxerrs.desc", "Set the maximum number of errors to print" },
            { "main.opt.Xmaxwarns.arg", "<number>" },
            { "main.opt.Xmaxwarns.desc", "Set the maximum number of warnings to print" },
            { "main.opt.add.exports.arg", "<module>/<package>=<other-module>(,<other-module>)*" },
            { "main.opt.add.exports.desc", "Specify a package to be considered as exported from its\ndefining module to additional modules, or to all unnamed\nmodules if <other-module> is ALL-UNNAMED" },
            { "main.opt.add.modules.arg", "<module>(,<module>)*" },
            { "main.opt.add.modules.desc", "Root modules to resolve in addition to the initial modules,\nor all modules on the module path if <module> is\nALL-MODULE-PATH." },
            { "main.opt.add.reads.arg", "<module>=<other-module>(,<other-module>)*" },
            { "main.opt.add.reads.desc", "Specify additional modules to be considered as required by a\ngiven module. <other-module> may be ALL-UNNAMED to require\nthe unnamed module." },
            { "main.opt.at.arg", "<file>" },
            { "main.opt.at.desc", "Read options and filenames from file" },
            { "main.opt.bootclasspath.arg", "<path>" },
            { "main.opt.bootclasspath.desc", "Override location of platform class files used for non-modular\nreleases" },
            { "main.opt.breakiterator.desc", "Compute first sentence with BreakIterator" },
            { "main.opt.class.path.arg", "<path>" },
            { "main.opt.class.path.desc", "Specify where to find user class files" },
            { "main.opt.doclet.arg", "<class>" },
            { "main.opt.doclet.desc", "Generate output via alternate doclet" },
            { "main.opt.docletpath.arg", "<path>" },
            { "main.opt.docletpath.desc", "Specify where to find doclet class files" },
            { "main.opt.enable.preview.desc", "Enable preview language features. To be used in conjunction with\neither -source or --release." },
            { "main.opt.encoding.arg", "<name>" },
            { "main.opt.encoding.desc", "Source file encoding name" },
            { "main.opt.exclude.arg", "<pkglist>" },
            { "main.opt.exclude.desc", "Specify a list of packages to exclude" },
            { "main.opt.expand.requires.arg", "<value>" },
            { "main.opt.expand.requires.desc", "Instructs the tool to expand the set of modules to be\ndocumented. By default, only the modules given explicitly on\nthe command line will be documented. A value of \"transitive\"\nwill additionally include all \"requires transitive\"\ndependencies of those modules. A value of \"all\" will include\nall dependencies of those modules." },
            { "main.opt.extdirs.arg", "<dirlist>" },
            { "main.opt.extdirs.desc", "Override location of installed extensions" },
            { "main.opt.help.desc", "Display command-line options and exit" },
            { "main.opt.help.extra.desc", "Print a synopsis of nonstandard options and exit" },
            { "main.opt.limit.modules.arg", "<module>(,<module>)*" },
            { "main.opt.limit.modules.desc", "Limit the universe of observable modules" },
            { "main.opt.locale.arg", "<name>" },
            { "main.opt.locale.desc", "Locale to be used, e.g. en_US or en_US_WIN" },
            { "main.opt.module.arg", "<module>(,<module>)*" },
            { "main.opt.module.desc", "Document the specified module(s)" },
            { "main.opt.module.path.arg", "<path>" },
            { "main.opt.module.path.desc", "Specify where to find application modules" },
            { "main.opt.module.source.path.arg", "<path>" },
            { "main.opt.module.source.path.desc", "Specify where to find input source files for multiple modules" },
            { "main.opt.package.desc", "Show package/protected/public types and members. For \nnamed modules, show all packages and all module details." },
            { "main.opt.patch.module.arg", "<module>=<file>(:<file>)*" },
            { "main.opt.patch.module.desc", "Override or augment a module with classes and resources in\nJAR files or directories" },
            { "main.opt.private.desc", "Show all types and members. For named modules,\nshow all packages and all module details." },
            { "main.opt.protected.desc", "Show protected/public types and members (default). For\nnamed modules, show exported packages and the module''s API." },
            { "main.opt.public.desc", "Show only public types and members. For named modules,\nshow exported packages and the module''s API." },
            { "main.opt.quiet.desc", "Do not display status messages" },
            { "main.opt.release.arg", "<release>" },
            { "main.opt.release.desc", "Provide source compatibility with specified release" },
            { "main.opt.show.members.arg", "<value>" },
            { "main.opt.show.members.desc", "Specifies which members (fields, methods, etc.) will be\ndocumented, where value can be one of \"public\", \"protected\",\n\"package\" or \"private\". The default is \"protected\", which will\nshow public and protected members, \"public\" will show only\npublic members, \"package\" will show public, protected and\npackage members and \"private\" will show all members." },
            { "main.opt.show.module.contents.arg", "<value>" },
            { "main.opt.show.module.contents.desc", "Specifies the documentation granularity of module\ndeclarations. Possible values are \"api\" or \"all\"." },
            { "main.opt.show.packages.arg", "<value>" },
            { "main.opt.show.packages.desc", "Specifies which module's packages will be documented. Possible\nvalues are \"exported\" or \"all\" packages." },
            { "main.opt.show.types.arg", "<value>" },
            { "main.opt.show.types.desc", "Specifies which types (classes, interfaces, etc.) will be\ndocumented, where value can be one of \"public\", \"protected\",\n\"package\" or \"private\". The default is \"protected\", which will\nshow public and protected types, \"public\" will show only\npublic types, \"package\" will show public, protected and\npackage types and \"private\" will show all types." },
            { "main.opt.source.arg", "<release>" },
            { "main.opt.source.desc", "Provide source compatibility with specified release" },
            { "main.opt.source.path.arg", "<path>" },
            { "main.opt.source.path.desc", "Specify where to find source files" },
            { "main.opt.subpackages.arg", "<subpkglist>" },
            { "main.opt.subpackages.desc", "Specify subpackages to recursively load" },
            { "main.opt.system.arg", "<jdk>" },
            { "main.opt.system.desc", "Override location of system modules used for modular releases" },
            { "main.opt.upgrade.module.path.arg", "<path>" },
            { "main.opt.upgrade.module.path.desc", "Override location of upgradeable modules" },
            { "main.opt.verbose.desc", "Output messages about what Javadoc is doing" },
            { "main.opt.version.desc", "Print version information" },
            { "main.out.of.memory", "java.lang.OutOfMemoryError: Please increase memory.\nFor example, on the JDK Classic or HotSpot VMs, add the option -J-Xmx\nsuch as -J-Xmx32m." },
            { "main.package_not_found", "Package {0} not found" },
            { "main.requires_argument", "option {0} requires an argument." },
            { "main.sourcepath_does_not_contain_module", "source path does not contain module {0}" },
            { "main.unexpected.exception", "an unexpected exception was caught: {0}" },
            { "main.unknown.error", "an unknown error has occurred" },
            { "main.unknown.option.for.filemanager", "option not supported by file manager: {0}" },
            { "main.unnecessary_arg_provided", "option {0} does not require an argument" },
            { "main.usage", "Usage:\n    javadoc [options] [packagenames] [sourcefiles] [@files]\nwhere options include:" },
            { "main.usage.foot", "\nGNU-style options may use '=' instead of whitespace to separate the name of an\noption from its value.\n" },
            { "main.warning", "{0} warning" },
            { "main.warnings", "{0} warnings" },
            { "main.warnings.Werror", "warnings found and -Werror specified" },
        };
    }
}
