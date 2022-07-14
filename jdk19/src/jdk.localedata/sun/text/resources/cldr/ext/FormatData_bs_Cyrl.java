/*
 * Copyright (c) 2012, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_bs_Cyrl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u043d\u0435\u0434\u0458\u0435\u0459\u0430",
            "\u043f\u043e\u043d\u0435\u0434\u0458\u0435\u0459\u0430\u043a",
            "\u0443\u0442\u043e\u0440\u0430\u043a",
            "\u0441\u0440\u0438\u0458\u0435\u0434\u0430",
            "\u0447\u0435\u0442\u0432\u0440\u0442\u0430\u043a",
            "\u043f\u0435\u0442\u0430\u043a",
            "\u0441\u0443\u0431\u043e\u0442\u0430",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u043d\u0435\u0434",
            "\u043f\u043e\u043d",
            "\u0443\u0442\u043e",
            "\u0441\u0440\u0438",
            "\u0447\u0435\u0442",
            "\u043f\u0435\u0442",
            "\u0441\u0443\u0431",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u043d",
            "\u043f",
            "\u0443",
            "\u0441",
            "\u0447",
            "\u043f",
            "\u0441",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u041f\u0440\u0432\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0414\u0440\u0443\u0433\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0422\u0440\u0435\u045b\u0435 \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0427\u0435\u0442\u0432\u0440\u0442\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "\u041a1",
            "\u041a2",
            "\u041a3",
            "\u041a4",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1.",
            "2.",
            "3.",
            "4.",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u043f\u0440\u0438\u0458\u0435 \u043f\u043e\u0434\u043d\u0435",
            "\u043f\u043e\u0441\u043b\u0438\u0458\u0435 \u043f\u043e\u0434\u043d\u0435",
            "\u043f\u043e\u043d\u043e\u045b",
            "\u043f\u043e\u0434\u043d\u0435",
            "\u0443\u0458\u0443\u0442\u0440\u0443",
            "",
            "\u0443 \u043f\u043e\u0434\u043d\u0435",
            "",
            "\u0443\u0432\u0435\u0447\u0435",
            "",
            "\u043d\u043e\u045b\u0443",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "\u043f\u043e\u043d\u043e\u045b",
            "\u043f\u043e\u0434\u043d\u0435",
            "\u0443\u0458\u0443\u0442\u0440\u0443",
            "",
            "\u0443 \u043f\u043e\u0434\u043d\u0435",
            "",
            "\u0443\u0432\u0435\u0447\u0435",
            "",
            "\u043d\u043e\u045b\u0443",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u043f\u0440\u0435 \u043f\u043e\u0434\u043d\u0435",
            "\u043f\u043e\u043f\u043e\u0434\u043d\u0435",
            "\u043f\u043e\u043d\u043e\u045b",
            "\u043f\u043e\u0434\u043d\u0435",
            "\u0443\u0458\u0443\u0442\u0440\u0443",
            "",
            "\u0443 \u043f\u043e\u0434\u043d\u0435",
            "",
            "\u0443\u0432\u0435\u0447\u0435",
            "",
            "\u043d\u043e\u045b\u0443",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, dd. MMMM y. G",
            "dd. MMMM y. G",
            "dd.MM.y. G",
            "d.M.y. GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, dd. MMMM y. GGGG",
            "dd. MMMM y. GGGG",
            "dd.MM.y. GGGG",
            "d.M.y. G",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_hm = "hh:mm a";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, dd. MMM y.";
        final String metaValue_generic_DateFormatItem_yMEd = "E, dd.MM.y.";
        final String metaValue_generic_DateFormatItem_hms = "hh:mm:ss a";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "dd. MMM y. G";
        final String metaValue_generic_DateFormatItem_Gy = "y. G";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, dd. MMM y. G";
        final String metaValue_generic_DateFormatItem_yMMMd = "dd. MMM y.";
        final String metaValue_generic_DateFormatItem_yw = "'\u0441\u0435\u0434\u043c\u0438\u0446\u0430' w '\u0433\u043e\u0434\u0438\u043d\u0430' Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "y QQQ";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y.";
        final String metaValue_generic_DateFormatItem_Md = "dd.MM.";
        final String metaValue_generic_DateFormatItem_Ed = "E, d.";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y. G";
        final String metaValue_generic_DateFormatItem_MMMMd = "d. MMMM";
        final String metaValue_generic_DateFormatItem_MEd = "E, dd.MM.";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, dd. MMM";
        final String metaValue_generic_DateFormatItem_yMd = "dd.MM.y.";
        final String metaValue_generic_DateFormatItem_MMMd = "dd. MMM";
        final String metaValue_generic_DateFormatItem_yM = "MM.y.";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y.";
        final String metaValue_generic_DateFormatItem_MMMMW = "'\u0441\u0435\u0434\u043c\u0438\u0446\u0430' W '\u043c\u0458\u0435\u0441\u0435\u0446' MMMM";
        final String metaValue_generic_DateFormatItem_yQQQQ = "y QQQQ";
        final String metaValue_generic_DateFormatItem_y = "y.";
        final String[] metaValue_MonthNames = new String[] {
            "\u0458\u0430\u043d\u0443\u0430\u0440",
            "\u0444\u0435\u0431\u0440\u0443\u0430\u0440",
            "\u043c\u0430\u0440\u0442",
            "\u0430\u043f\u0440\u0438\u043b",
            "\u043c\u0430\u0458",
            "\u0458\u0443\u043d\u0438",
            "\u0458\u0443\u043b\u0438",
            "\u0430\u0443\u0433\u0443\u0441\u0442",
            "\u0441\u0435\u043f\u0442\u0435\u043c\u0431\u0430\u0440",
            "\u043e\u043a\u0442\u043e\u0431\u0430\u0440",
            "\u043d\u043e\u0432\u0435\u043c\u0431\u0430\u0440",
            "\u0434\u0435\u0446\u0435\u043c\u0431\u0430\u0440",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u0458\u0430\u043d",
            "\u0444\u0435\u0431",
            "\u043c\u0430\u0440",
            "\u0430\u043f\u0440",
            "\u043c\u0430\u0458",
            "\u0458\u0443\u043d",
            "\u0458\u0443\u043b",
            "\u0430\u0443\u0433",
            "\u0441\u0435\u043f",
            "\u043e\u043a\u0442",
            "\u043d\u043e\u0432",
            "\u0434\u0435\u0446",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u0458",
            "\u0444",
            "\u043c",
            "\u0430",
            "\u043c",
            "\u0458",
            "\u0458",
            "\u0430",
            "\u0441",
            "\u043e",
            "\u043d",
            "\u0434",
            "",
        };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0411\u0415",
        };
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
            "\u043d\u043e\u0432\u0435 \u0435\u0440\u0435",
            "\u041c\u0435\u0438\u0452\u0438",
            "\u0422\u0430\u0438\u0448\u043e",
            "\u0428\u043e\u0432\u0430",
            "\u0425\u0430\u0438\u0441\u0435\u0438",
            "\u0420\u0435\u0438\u0432\u0430",
        };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
            "\u043d. \u0435.",
            "\u041c\u0435\u0438\u0452\u0438",
            "\u0422\u0430\u0438\u0448\u043e",
            "\u0428\u043e\u0432\u0430",
            "\u0425\u0430\u0438\u0441\u0435\u0438",
            "\u0420\u0435\u0438\u0432\u0430",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u041f\u0440\u0435 \u0420\u041a",
            "\u0420\u041a",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u0410\u0425",
        };
        final String metaValue_calendarname_gregorian = "\u0433\u0440\u0435\u0433\u043e\u0440\u0438\u0458\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "calendarname.islamic-civil", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438 \u0446\u0438\u0432\u0438\u043b\u043d\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.minute", "\u043c\u0438\u043d\u0443\u0442" },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames",
                new String[] {
                    "\u041c\u0443\u0440\u0430\u0445\u0430\u043c",
                    "\u0421\u0430\u0444\u0430\u0440",
                    "\u0420\u0430\u0431\u0438\u02bb I",
                    "\u0420\u0430\u0431\u0438\u02bb II",
                    "\u0408\u0443\u043c\u0430\u0434\u0430 I",
                    "\u0408\u0443\u043c\u0430\u0434\u0430 II",
                    "\u0420\u0430\u0452\u0430\u0431",
                    "\u0428\u0430\u02bb\u0431\u0430\u043d",
                    "\u0420\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0428\u0430\u0432\u0430\u043b",
                    "\u0414\u0443\u02bb\u043b-\u041a\u0438\u02bb\u0434\u0430",
                    "\u0414\u0443\u02bb\u043b-\u0445\u0438\u0452\u0430",
                    "",
                }
            },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, dd. MMMM y. GGGG",
                    "dd. MMMM y. GGGG",
                    "dd.MM.y. GGGG",
                    "dd.MM.y. GGGG",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434" },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "calendarname.islamic", "\u0438\u0441\u043b\u0430\u043c\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "\u0412\u0440\u0435\u043c\u0435: {0}" },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyMd", "dd.MM.y. G" },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMEd", "E, dd.MM.y. G" },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "DatePatterns",
                new String[] {
                    "EEEE, dd. MMMM y.",
                    "dd. MMMM y.",
                    "dd.MM.y.",
                    "d.M.yy.",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "field.year", "\u0433\u043e\u0434\u0438\u043d\u0430" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d, y G",
                    "MMMM d, y G",
                    "MMM d, y G",
                    "M/d/yy G",
                }
            },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "narrow.Eras",
                new String[] {
                    "\u043f.\u043d.\u0435.",
                    "\u043d.\u0435.",
                }
            },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u0458\u0430\u043f\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "generic.DateFormatItem.h", "hh a" },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "long.Eras",
                new String[] {
                    "\u043f\u0440\u0438\u0458\u0435 \u043d\u043e\u0432\u0435 \u0435\u0440\u0435",
                    "\u043d\u043e\u0432\u0435 \u0435\u0440\u0435",
                }
            },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d, y GGGG",
                    "MMMM d, y GGGG",
                    "MMM d, y GGGG",
                    "M/d/yy GGGG",
                }
            },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "\u0435\u0440\u0430" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "field.dayperiod", "\u043f\u0440\u0438\u0458\u0435 \u043f\u043e\u0434\u043d\u0435/\u043f\u043e\u0441\u043b\u0438\u0458\u0435 \u043f\u043e\u0434\u043d\u0435" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.roc", "\u041a\u0430\u043b\u0435\u043d\u0434\u0430\u0440 \u0420\u0435\u043f\u0443\u0431\u043b\u0438\u043a\u0435 \u041a\u0438\u043d\u0435" },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "generic.DateFormatItem.yyyyM", "MM.y. G" },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "\u043c\u0458\u0435\u0441\u0435\u0446" },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0 few:0 other:0}",
                    "{one:00' '\u0445\u0438\u0459 few:00' '\u0445\u0438\u0459 other:00' '\u0445\u0438\u0459}",
                    "{one:000' '\u0445\u0438\u0459 few:000' '\u0445\u0438\u0459 other:000' '\u0445\u0438\u0459}",
                    "{one:0' '\u043c\u0438\u043b few:0' '\u043c\u0438\u043b other:0' '\u043c\u0438\u043b}",
                    "{one:00' '\u043c\u0438\u043b few:00' '\u043c\u0438\u043b other:00' '\u043c\u0438\u043b}",
                    "{one:000' '\u043c\u0438\u043b few:000' '\u043c\u0438\u043b other:000' '\u043c\u0438\u043b}",
                    "{one:0' '\u043c\u043b\u0440\u0434 few:0' '\u043c\u043b\u0440\u0434 other:0' '\u043c\u043b\u0440\u0434}",
                    "{one:00' '\u043c\u043b\u0440\u0434 few:00' '\u043c\u043b\u0440\u0434 other:00' '\u043c\u043b\u0440\u0434}",
                    "{one:000' '\u043c\u043b\u0440\u0434 few:000' '\u043c\u043b\u0440\u0434 other:000' '\u043c\u043b\u0440\u0434}",
                    "{one:0' '\u0431\u0438\u043b few:0' '\u0431\u0438\u043b other:0' '\u0431\u0438\u043b}",
                    "{one:00' '\u0431\u0438\u043b few:00' '\u0431\u0438\u043b other:00' '\u0431\u0438\u043b}",
                    "{one:000' '\u0431\u0438\u043b few:000' '\u0431\u0438\u043b other:000' '\u0431\u0438\u043b}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.zone", "\u0437\u043e\u043d\u0430" },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras",
                new String[] {
                    "\u043f. \u043d. \u0435.",
                    "\u043d. \u0435.",
                }
            },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, dd. MMMM y. G",
                    "dd. MMMM y. G",
                    "dd.MM.y. G",
                    "dd.MM.y. G",
                }
            },
            { "field.weekday", "\u0434\u0430\u043d \u0443 \u0441\u0435\u0434\u043c\u0438\u0446\u0438" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "\u0441\u0435\u0434\u043c\u0438\u0446\u0430" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0 few:0 other:0}",
                    "{one:00\u00a0\u0445\u0438\u0459 few:00\u00a0\u0445\u0438\u0459 other:00\u00a0\u0445\u0438\u0459}",
                    "{one:000\u00a0\u0445\u0438\u0459 few:000\u00a0\u0445\u0438\u0459 other:000\u00a0\u0445\u0438\u0459}",
                    "{one:0\u00a0\u043c\u0438\u043b few:0\u00a0\u043c\u0438\u043b other:0\u00a0\u043c\u0438\u043b}",
                    "{one:00\u00a0\u043c\u0438\u043b few:00\u00a0\u043c\u0438\u043b other:00\u00a0\u043c\u0438\u043b}",
                    "{one:000\u00a0\u043c\u0438\u043b few:000\u00a0\u043c\u0438\u043b other:000\u00a0\u043c\u0438\u043b}",
                    "{one:0\u00a0\u043c\u043b\u0440\u0434 few:0\u00a0\u043c\u043b\u0440\u0434 other:0\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:00\u00a0\u043c\u043b\u0440\u0434 few:00\u00a0\u043c\u043b\u0440\u0434 other:00\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:000\u00a0\u043c\u043b\u0440\u0434 few:000\u00a0\u043c\u043b\u0440\u0434 other:000\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:0\u00a0\u0431\u0438\u043b few:0\u00a0\u0431\u0438\u043b other:0\u00a0\u0431\u0438\u043b}",
                    "{one:00\u00a0\u0431\u0438\u043b few:00\u00a0\u0431\u0438\u043b other:00\u00a0\u0431\u0438\u043b}",
                    "{one:000\u00a0\u0431\u0438\u043b few:000\u00a0\u0431\u0438\u043b other:000\u00a0\u0431\u0438\u043b}",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "\u0441\u0430\u0442" },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u0431\u0443\u0434\u0438\u0441\u0442\u0438\u0447\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "",
                }
            },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
