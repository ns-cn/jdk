package sun.net.httpserver.simpleserver.resources;

import java.util.ListResourceBundle;

public final class simpleserver_ja extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.invalid.arg", "{0}\u306B\u7121\u52B9\u306A\u5024\u304C\u6307\u5B9A\u3055\u308C\u307E\u3057\u305F: {1}" },
            { "err.missing.arg", "{0}\u306B\u5024\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093" },
            { "err.server.config.failed", "\u30B5\u30FC\u30D0\u30FC\u306E\u69CB\u6210\u306B\u5931\u6557\u3057\u307E\u3057\u305F: {0}" },
            { "err.server.handle.failed", "\u30B5\u30FC\u30D0\u30FC\u4EA4\u63DB\u51E6\u7406\u304C\u5931\u6557\u3057\u307E\u3057\u305F: {0}" },
            { "err.unknown.option", "\u4E0D\u660E\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.prefix", "\u30A8\u30E9\u30FC:" },
            { "html.dir.list", "\u6B21\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u30FB\u30EA\u30B9\u30C8" },
            { "html.not.found", "\u30D5\u30A1\u30A4\u30EB\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093\u3067\u3057\u305F" },
            { "loopback.info", "\u30C7\u30D5\u30A9\u30EB\u30C8\u3067\u30EB\u30FC\u30D7\u30D0\u30C3\u30AF\u306B\u30D0\u30A4\u30F3\u30C9\u3057\u307E\u3059\u3002\u3059\u3079\u3066\u306E\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9\u3067\"-b 0.0.0.0\"\u307E\u305F\u306F\"-b ::\"\u3092\u4F7F\u7528\u3057\u307E\u3059\u3002" },
            { "msg.start.anylocal", "{0}\u304A\u3088\u3073\u30B5\u30D6\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u30920.0.0.0 (\u3059\u3079\u3066\u306E\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9)\u30DD\u30FC\u30C8{2}\u3067\u4F7F\u7528\u3057\u307E\u3059\nURL http://{1}:{2}/" },
            { "msg.start.other", "{0}\u304A\u3088\u3073\u30B5\u30D6\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3092{1}\u30DD\u30FC\u30C8{2}\u3067\u4F7F\u7528\u3057\u307E\u3059\nURL http://{1}:{2}/" },
            { "opt.bindaddress", "-b, --bind-address    - \u30D0\u30A4\u30F3\u30C9\u5148\u30A2\u30C9\u30EC\u30B9\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: {0} (\u30EB\u30FC\u30D7\u30D0\u30C3\u30AF).\n                        \u3059\u3079\u3066\u306E\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9\u3067\"-b 0.0.0.0\"\u307E\u305F\u306F\"-b ::\"\u3092\u4F7F\u7528\u3057\u307E\u3059\u3002" },
            { "opt.directory", "-d, --directory       - \u4F7F\u7528\u3059\u308B\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: \u73FE\u5728\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3002" },
            { "opt.output", "-o, --output          - \u51FA\u529B\u5F62\u5F0F\u3002none|info|verbose. \u30C7\u30D5\u30A9\u30EB\u30C8: info\u3002" },
            { "opt.port", "-p, --port            - \u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u30DD\u30FC\u30C8\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: 8000\u3002" },
            { "options", "\u30AA\u30D7\u30B7\u30E7\u30F3:\n-b, --bind-address    - \u30D0\u30A4\u30F3\u30C9\u5148\u30A2\u30C9\u30EC\u30B9\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: {0} (\u30EB\u30FC\u30D7\u30D0\u30C3\u30AF)\u3002\n                        \u3059\u3079\u3066\u306E\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9\u3067\"-b 0.0.0.0\"\u307E\u305F\u306F\"-b ::\"\u3092\u4F7F\u7528\u3057\u307E\u3059\u3002\n-d, --directory       - \u4F7F\u7528\u3059\u308B\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: \u73FE\u5728\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3002\n-o, --output          - \u51FA\u529B\u5F62\u5F0F\u3002none|info|verbose\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: info\u3002\n-p, --port            - \u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u30DD\u30FC\u30C8\u3002\u30C7\u30D5\u30A9\u30EB\u30C8: 8000\u3002\n-h, -?, --help        - \u30D8\u30EB\u30D7\u30FB\u30E1\u30C3\u30BB\u30FC\u30B8\u3092\u51FA\u529B\u3057\u3066\u7D42\u4E86\u3057\u307E\u3059\u3002\n-version, --version   - \u30D0\u30FC\u30B8\u30E7\u30F3\u60C5\u5831\u3092\u51FA\u529B\u3057\u3066\u7D42\u4E86\u3057\u307E\u3059\u3002\n\u30B5\u30FC\u30D0\u30FC\u3092\u505C\u6B62\u3059\u308B\u306B\u306F\u3001[Ctrl]+[C]\u3092\u62BC\u3057\u307E\u3059\u3002" },
            { "usage.java", "\u4F7F\u7528\u65B9\u6CD5: java -m jdk.httpserver [-b bind address] [-p port] [-d directory]\n                              [-o none|info|verbose] [-h to show options]\n                              [-version to show version information]" },
            { "usage.jwebserver", "\u4F7F\u7528\u65B9\u6CD5: jwebserver [-b bind address] [-p port] [-d directory]\n                  [-o none|info|verbose] [-h to show options]\n                  [-version to show version information]" },
            { "version", "{0} {1}" },
        };
    }
}
