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

public class FormatData_zh_Hant_HK extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "Q1",
            "Q2",
            "Q3",
            "Q4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u4e0a\u5348",
            "\u4e0b\u5348",
            "\u5348\u591c",
            "",
            "\u65e9\u4e0a",
            "\u4e0a\u5348",
            "\u4e2d\u5348",
            "\u4e0b\u5348",
            "\u665a\u4e0a",
            "",
            "\u51cc\u6668",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "ah:mm:ss [zzzz]",
            "ah:mm:ss [z]",
            "ah:mm:ss",
            "ah:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "Gy\u5e74M\u6708d\u65e5EEEE",
            "Gy\u5e74M\u6708d\u65e5",
            "Gy\u5e74M\u6708d\u65e5",
            "Gy/M/d",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGGy\u5e74M\u6708d\u65e5EEEE",
            "GGGGy\u5e74M\u6708d\u65e5",
            "GGGGy\u5e74M\u6708d\u65e5",
            "GGGGy/M/d",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd/MM";
        final String metaValue_generic_DateFormatItem_hm = "ah:mm";
        final String metaValue_generic_DateFormatItem_yyyyMMMM = "Gy\u5e74M\u6708";
        final String metaValue_generic_DateFormatItem_Ehm = "E ah:mm";
        final String metaValue_generic_DateFormatItem_hms = "ah:mm:ss";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "Gy\u5e74M\u6708d\u65e5";
        final String metaValue_generic_DateFormatItem_hmv = "ah:mm [v]";
        final String metaValue_generic_DateFormatItem_Gy = "Gy\u5e74";
        final String metaValue_generic_DateFormatItem_hmsv = "ah:mm:ss [v]";
        final String metaValue_generic_DateFormatItem_yw = "Y\u5e74\u7b2cw\u9031";
        final String metaValue_generic_DateFormatItem_MMMEd = "M\u6708d\u65e5E";
        final String metaValue_generic_DateFormatItem_h = "ah\u6642";
        final String metaValue_generic_DateFormatItem_MMMMW = "M\u6708\u7b2cW\u9031";
        final String metaValue_generic_DateFormatItem_yMMMEd = "y\u5e74M\u6708d\u65e5E";
        final String metaValue_generic_DateFormatItem_Ehms = "E ah:mm:ss";
        final String metaValue_generic_DateFormatItem_yMEd = "d/M/y\uff08E\uff09";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "Gy\u5e74M\u6708d\u65e5E";
        final String metaValue_generic_DateFormatItem_yyyyMEd = "Gy/M/dE";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_Ed = "d\u65e5E";
        final String metaValue_generic_DateFormatItem_MEd = "d/M\uff08E\uff09";
        final String metaValue_generic_DateFormatItem_yMM = "MM/y";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String[] metaValue_long_Eras = new String[] {
            "\u516c\u5143\u524d",
            "\u516c\u5143",
        };
        final String[] metaValue_short_CompactNumberPatterns = new String[] {
            "",
            "",
            "",
            "{other:0K}",
            "{other:00K}",
            "{other:000K}",
            "{other:0M}",
            "{other:00M}",
            "{other:000M}",
            "{other:0B}",
            "{other:00B}",
            "{other:000B}",
            "{other:0T}",
            "{other:00T}",
            "{other:000T}",
        };
        final Object[][] data = new Object[][] {
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateFormatItem.yyyyQQQQ", "Gy\u5e74QQQQ" },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyMd", "Gy/M/d" },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yyyyMEd },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "timezone.regionFormat.daylight", "{0}\u590f\u4ee4\u6642\u9593" },
            { "DatePatterns",
                new String[] {
                    "y\u5e74M\u6708d\u65e5EEEE",
                    "y\u5e74M\u6708d\u65e5",
                    "y\u5e74M\u6708d\u65e5",
                    "d/M/y",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "timezone.regionFormat.standard", "{0}\u6a19\u6e96\u6642\u9593" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "long.Eras", metaValue_long_Eras },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yyyyM", "Gy/M" },
            { "generic.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "generic.DateFormatItem.yyyyQQQ", "Gy\u5e74QQQ" },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "long.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "roc.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yyyyMEd },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_long_Eras },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "field.weekday", "\u661f\u671f\u5e7e" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "field.week", "\u661f\u671f" },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "short.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
        };
        return data;
    }
}
