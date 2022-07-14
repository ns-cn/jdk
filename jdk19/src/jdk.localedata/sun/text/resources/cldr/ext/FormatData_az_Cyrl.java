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

public class FormatData_az_Cyrl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0431\u0430\u0437\u0430\u0440",
            "\u0431\u0430\u0437\u0430\u0440 \u0435\u0440\u0442\u04d9\u0441\u0438",
            "\u0447\u04d9\u0440\u0448\u04d9\u043d\u0431\u04d9 \u0430\u0445\u0448\u0430\u043c\u044b",
            "\u0447\u04d9\u0440\u0448\u04d9\u043d\u0431\u04d9",
            "\u04b9\u04af\u043c\u04d9 \u0430\u0445\u0448\u0430\u043c\u044b",
            "\u04b9\u04af\u043c\u04d9",
            "\u0448\u04d9\u043d\u0431\u04d9",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u0411.",
            "\u0411.\u0415.",
            "\u0427.\u0410.",
            "\u0427.",
            "\u04b8.\u0410.",
            "\u04b8.",
            "\u0428.",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "7",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1-\u04b9\u0438 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "2-\u04b9\u0438 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "3-\u04b9\u04af \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "4-\u04b9\u04af \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1-\u04b9\u0438 \u043a\u0432.",
            "2-\u04b9\u0438 \u043a\u0432.",
            "3-\u04b9\u04af \u043a\u0432.",
            "4-\u04b9\u04af \u043a\u0432.",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0410\u041c",
            "\u041f\u041c",
            "\u049d\u0435\u04b9\u04d9\u0458\u0430\u0440\u044b",
            "\u049d\u04af\u043d\u043e\u0440\u0442\u0430",
            "\u0441\u04af\u0431\u04bb",
            "\u0441\u04d9\u04bb\u04d9\u0440",
            "\u049d\u04af\u043d\u0434\u04af\u0437",
            "",
            "\u0430\u0445\u0448\u0430\u043c\u04af\u0441\u0442\u04af",
            "",
            "\u0430\u0445\u0448\u0430\u043c",
            "\u049d\u0435\u04b9\u04d9",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u0430",
            "\u043f",
            "\u049d\u0435\u04b9\u04d9\u0458\u0430\u0440\u044b",
            "\u049d",
            "\u0441\u04af\u0431\u04bb",
            "\u0441\u04d9\u04bb\u04d9\u0440",
            "\u049d\u04af\u043d\u0434\u04af\u0437",
            "",
            "\u0430\u0445\u0448\u0430\u043c\u04af\u0441\u0442\u04af",
            "",
            "\u0430\u0445\u0448\u0430\u043c",
            "\u049d\u0435\u04b9\u04d9",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "G d MMMM y, EEEE",
            "G d MMMM, y",
            "G d MMM y",
            "GGGGG dd.MM.y",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGG d MMMM y, EEEE",
            "GGGG d MMMM, y",
            "GGGG d MMM y",
            "G dd.MM.y",
        };
        final String metaValue_generic_DateFormatItem_yMMMEd = "d MMM y, E";
        final String metaValue_generic_DateFormatItem_yMEd = "dd.MM.y, E";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "G d MMM y";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "G d MMM y, E";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yw = "Y, w '\u04bb\u04d9\u0444\u0442\u04d9'";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM, y";
        final String metaValue_generic_DateFormatItem_Md = "dd.MM";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "G MMM y";
        final String metaValue_generic_DateFormatItem_MEd = "dd.MM, E";
        final String metaValue_generic_DateFormatItem_MMMEd = "d MMM, E";
        final String metaValue_generic_DateFormatItem_yMd = "dd.MM.y";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_yM = "MM.y";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM, W '\u04bb\u04d9\u0444\u0442\u04d9'";
        final String[] metaValue_MonthNames = new String[] {
            "\u0458\u0430\u043d\u0432\u0430\u0440",
            "\u0444\u0435\u0432\u0440\u0430\u043b",
            "\u043c\u0430\u0440\u0442",
            "\u0430\u043f\u0440\u0435\u043b",
            "\u043c\u0430\u0439",
            "\u0438\u0458\u0443\u043d",
            "\u0438\u0458\u0443\u043b",
            "\u0430\u0432\u0433\u0443\u0441\u0442",
            "\u0441\u0435\u043d\u0442\u0458\u0430\u0431\u0440",
            "\u043e\u043a\u0442\u0458\u0430\u0431\u0440",
            "\u043d\u043e\u0458\u0430\u0431\u0440",
            "\u0434\u0435\u043a\u0430\u0431\u0440",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u0458\u0430\u043d",
            "\u0444\u0435\u0432",
            "\u043c\u0430\u0440",
            "\u0430\u043f\u0440",
            "\u043c\u0430\u0439",
            "\u0438\u0458\u043d",
            "\u0438\u0458\u043b",
            "\u0430\u0432\u0433",
            "\u0441\u0435\u043d",
            "\u043e\u043a\u0442",
            "\u043d\u043e\u0458",
            "\u0434\u0435\u043a",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "\u0435.\u04d9.",
            "\u0458.\u0435.",
        };
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
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
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DayNames", metaValue_generic_DayNames },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyMd", "GGGGG dd.MM.y" },
            { "generic.DateFormatItem.yyyyMEd", "GGGGG dd.MM.y, E" },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "d MMMM y, EEEE",
                    "d MMMM y",
                    "d MMM y",
                    "dd.MM.yy",
                }
            },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.Eras",
                new String[] {
                    "\u0435\u0440\u0430\u043c\u044b\u0437\u0434\u0430\u043d \u04d9\u0432\u0432\u04d9\u043b",
                    "\u0458\u0435\u043d\u0438 \u0435\u0440\u0430",
                }
            },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yyyyM", "GGGGG MM y" },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_Eras },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthNames",
                new String[] {
                    "\u0408\u0430\u043d\u0432\u0430\u0440",
                    "\u0424\u0435\u0432\u0440\u0430\u043b",
                    "\u041c\u0430\u0440\u0442",
                    "\u0410\u043f\u0440\u0435\u043b",
                    "\u041c\u0430\u0439",
                    "\u0418\u0458\u0443\u043d",
                    "\u0418\u0458\u0443\u043b",
                    "\u0410\u0432\u0433\u0443\u0441\u0442",
                    "\u0421\u0435\u043d\u0442\u0458\u0430\u0431\u0440",
                    "\u041e\u043a\u0442\u0458\u0430\u0431\u0440",
                    "\u041d\u043e\u0458\u0430\u0431\u0440",
                    "\u0414\u0435\u043a\u0430\u0431\u0440",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
        };
        return data;
    }
}
