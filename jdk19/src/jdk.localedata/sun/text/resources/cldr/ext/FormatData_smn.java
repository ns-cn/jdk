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

public class FormatData_smn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "pasepeeivi",
            "vuossaarg\u00e2",
            "majebaarg\u00e2",
            "koskoho",
            "tuor\u00e2stuv",
            "v\u00e1stuppeeivi",
            "l\u00e1vurduv",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "pas",
            "vuo",
            "maj",
            "kos",
            "tuo",
            "v\u00e1s",
            "l\u00e1v",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "p",
            "V",
            "M",
            "K",
            "T",
            "V",
            "L",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1. ni\u00e4lj\u00e1d\u00e2s",
            "2. ni\u00e4lj\u00e1d\u00e2s",
            "3. ni\u00e4lj\u00e1d\u00e2s",
            "4. ni\u00e4lj\u00e1d\u00e2s",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1. ni\u00e4lj.",
            "2. ni\u00e4lj.",
            "3. ni\u00e4lj.",
            "4. ni\u00e4lj.",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "ip.",
            "ep.",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "H.mm.ss zzzz",
            "H.mm.ss z",
            "H.mm.ss",
            "H.mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "cccc MMMM d. y G",
            "MMMM d. y G",
            "d.M.y G",
            "d.M.y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE MMMM d. y GGGG",
            "MMMM d. y GGGG",
            "d.M.y GGGG",
            "d.M.y G",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} 'tme' {0}",
            "{1} 'tme' {0}",
            "{1} 'tme' {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_hm = "h.mm a";
        final String metaValue_generic_DateFormatItem_Ehm = "E h.mm a";
        final String metaValue_generic_DateFormatItem_hms = "h.mm.ss a";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "MMM d. y G";
        final String metaValue_generic_DateFormatItem_hmv = "h.mm a v";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_hmsv = "h.mm.ss a v";
        final String metaValue_generic_DateFormatItem_yw = "'okko' w, Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_Hm = "H.mm";
        final String metaValue_generic_DateFormatItem_EHm = "E H.mm";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "LLL y G";
        final String metaValue_generic_DateFormatItem_MMMMd = "MMMM d.";
        final String metaValue_generic_DateFormatItem_H = "H";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, MMM d.";
        final String metaValue_generic_DateFormatItem_Hmsv = "H.mm.ss v";
        final String metaValue_generic_DateFormatItem_MMMd = "MMM d.";
        final String metaValue_generic_DateFormatItem_MMMMW = "'okko' W, MMMM";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "ccc, MMM d. y";
        final String metaValue_generic_DateFormatItem_Ehms = "E h.mm.ss a";
        final String metaValue_generic_DateFormatItem_yMEd = "E d.M.y";
        final String metaValue_generic_DateFormatItem_yMMMd = "MMM d. y";
        final String metaValue_generic_DateFormatItem_ms = "m.ss.";
        final String metaValue_generic_DateFormatItem_EHms = "E H.mm.ss";
        final String metaValue_generic_DateFormatItem_yMMM = "LLL y";
        final String metaValue_generic_DateFormatItem_Md = "d.M.";
        final String metaValue_generic_DateFormatItem_Ed = "E d.";
        final String metaValue_generic_DateFormatItem_MEd = "E d.M.";
        final String metaValue_generic_DateFormatItem_GyMMMEd = "E, MMM d. y G";
        final String metaValue_generic_DateFormatItem_Hms = "H.mm.ss";
        final String metaValue_generic_DateFormatItem_Hmv = "H.mm v";
        final String metaValue_generic_DateFormatItem_yMd = "d.M.y";
        final String metaValue_generic_DateFormatItem_yM = "L.y";
        final String metaValue_generic_DateFormatItem_yMMMM = "LLLL y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthNames = new String[] {
            "u\u0111\u0111\u00e2ivem\u00e1\u00e1nu",
            "kuov\u00e2m\u00e1\u00e1nu",
            "njuh\u010d\u00e2m\u00e1\u00e1nu",
            "cu\u00e1\u014buim\u00e1\u00e1nu",
            "vyesim\u00e1\u00e1nu",
            "kesim\u00e1\u00e1nu",
            "syeinim\u00e1\u00e1nu",
            "porgem\u00e1\u00e1nu",
            "\u010doh\u010d\u00e2m\u00e1\u00e1nu",
            "roovv\u00e2dm\u00e1\u00e1nu",
            "skamm\u00e2m\u00e1\u00e1nu",
            "juovl\u00e2m\u00e1\u00e1nu",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "u\u0111iv",
            "kuov\u00e2",
            "njuh\u010d\u00e2",
            "cu\u00e1\u014bui",
            "vyesi",
            "kesi",
            "syeini",
            "porge",
            "\u010doh\u010d\u00e2",
            "roovv\u00e2d",
            "skamm\u00e2",
            "juovl\u00e2",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "U",
            "K",
            "NJ",
            "C",
            "V",
            "K",
            "S",
            "P",
            "\u010c",
            "R",
            "S",
            "J",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "oKr.",
            "mKr.",
        };
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "islamic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMd", "d.M.y G" },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMEd", "E d.M.y G" },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DatePatterns",
                new String[] {
                    "EEEE, MMMM d. y",
                    "MMMM d. y",
                    "MMM d. y",
                    "d.M.y",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames",
                new String[] {
                    "pasepeivi",
                    "vuossarg\u00e2",
                    "majebarg\u00e2",
                    "koskokko",
                    "tuor\u00e2st\u00e2h",
                    "v\u00e1stuppeivi",
                    "l\u00e1vurd\u00e2h",
                }
            },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "long.Eras",
                new String[] {
                    "Ovdil Kristus \u0161odd\u00e2m",
                    "ma\u014ba Kristus \u0161odd\u00e2m",
                }
            },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_Eras },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", "E MMM d. y G" },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "epiloho",
                    "",
                    "",
                }
            },
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "generic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "generic.DateFormatItem.yyyyM", "L.y G" },
            { "islamic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DateFormatItem.yyyyMMMM", "LLLL y G" },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'tuhh\u00e1\u00e1t two:0' 'tuhh\u00e1\u00e1t other:0' 'tuhh\u00e1\u00e1t}",
                    "{one:00' 'tuhh\u00e1\u00e1t two:00' 'tuhh\u00e1\u00e1t other:00' 'tuhh\u00e1\u00e1t}",
                    "{one:000' 'tuhh\u00e1\u00e1t two:000' 'tuhh\u00e1\u00e1t other:000' 'tuhh\u00e1\u00e1t}",
                    "{one:0' 'miljovn two:0' 'miljovn other:0' 'miljovn}",
                    "{one:00' 'miljovn two:00' 'miljovn other:00' 'miljovn}",
                    "{one:000' 'miljovn two:000' 'miljovn other:000' 'miljovn}",
                    "{one:0' 'miljard two:0' 'miljard other:0' 'miljard}",
                    "{one:00' 'miljard two:00' 'miljard other:00' 'miljard}",
                    "{one:000' 'miljard two:000' 'miljard other:000' 'miljard}",
                    "{one:0' 'biljovn two:0' 'biljovn other:0' 'biljovn}",
                    "{one:00' 'biljovn two:00' 'biljovn other:00' 'biljovn}",
                    "{one:000' 'biljovn two:000' 'biljovn other:000' 'biljovn}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.DatePatterns",
                new String[] {
                    "cccc, MMMM d. y",
                    "MMMM d. y",
                    "MMM d. y",
                    "d.M.y",
                }
            },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "PluralRules", "one:n = 1;two:n = 2" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
