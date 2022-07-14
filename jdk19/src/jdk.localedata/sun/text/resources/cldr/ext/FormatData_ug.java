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

public class FormatData_ug extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u064a\u06d5\u0643\u0634\u06d5\u0646\u0628\u06d5",
            "\u062f\u06c8\u0634\u06d5\u0646\u0628\u06d5",
            "\u0633\u06d5\u064a\u0634\u06d5\u0646\u0628\u06d5",
            "\u0686\u0627\u0631\u0634\u06d5\u0646\u0628\u06d5",
            "\u067e\u06d5\u064a\u0634\u06d5\u0646\u0628\u06d5",
            "\u062c\u06c8\u0645\u06d5",
            "\u0634\u06d5\u0646\u0628\u06d5",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u064a\u06d5",
            "\u062f\u06c8",
            "\u0633\u06d5",
            "\u0686\u0627",
            "\u067e\u06d5",
            "\u062c\u06c8",
            "\u0634\u06d5",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u064a",
            "\u062f",
            "\u0633",
            "\u0686",
            "\u067e",
            "\u062c",
            "\u0634",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0628\u0649\u0631\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u0626\u0649\u0643\u0643\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u0626\u06c8\u0686\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u062a\u06c6\u062a\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1-\u067e\u06d5\u0633\u0649\u0644",
            "2-\u067e\u06d5\u0633\u0649\u0644",
            "3-\u067e\u06d5\u0633\u0649\u0644",
            "4-\u067e\u06d5\u0633\u0649\u0644",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
            "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0643\u06d0\u064a\u0649\u0646",
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
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u0628",
            "\u0643",
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
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u0686.\u0628",
            "\u0686.\u0643",
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
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE\u060c MMMM d\u060c y G",
            "MMMM d\u060c y G",
            "MMM d\u060c y G",
            "M/d/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE\u060c MMMM d\u060c y GGGG",
            "MMMM d\u060c y GGGG",
            "MMM d\u060c y GGGG",
            "M/d/y G",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1}\u060c {0}",
            "{1}\u060c {0}",
        };
        final String metaValue_generic_DateFormatItem_hmv = "h:mm a v";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss a v";
        final String metaValue_generic_DateFormatItem_yw = "Y\u060c w-\u06be\u06d5\u067e\u062a\u06d5";
        final String metaValue_generic_DateFormatItem_yQQQ = "y QQQ";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String metaValue_generic_DateFormatItem_MMMMd = "d-MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "d-MMM\u060c E";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH:mm:ss v";
        final String metaValue_generic_DateFormatItem_MMMd = "d-MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM\u060c W-\u06be\u06d5\u067e\u062a\u06d5";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_GyMMM = "y MMM G";
        final String metaValue_generic_DateFormatItem_yMMMEd = "y d-MMM\u060c E";
        final String metaValue_generic_DateFormatItem_yMEd = "y-d-M\u060c E";
        final String metaValue_generic_DateFormatItem_GyMMMd = "y d-MMM G";
        final String metaValue_generic_DateFormatItem_yMMMd = "y d-MMM";
        final String metaValue_generic_DateFormatItem_yMMM = "y MMM";
        final String metaValue_generic_DateFormatItem_Md = "d-M";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MEd = "d-M\u060c E";
        final String metaValue_generic_DateFormatItem_GyMMMEd = "y d-MMM\u060c E G";
        final String metaValue_generic_DateFormatItem_Hmv = "HH:mm v";
        final String metaValue_generic_DateFormatItem_yMd = "y-d-M";
        final String metaValue_generic_DateFormatItem_yM = "M-y";
        final String metaValue_generic_DateFormatItem_yMMMM = "y MMMM";
        final String metaValue_generic_DateFormatItem_yQQQQ = "y QQQQ";
        final String[] metaValue_MonthNames = new String[] {
            "\u064a\u0627\u0646\u06cb\u0627\u0631",
            "\u0641\u06d0\u06cb\u0631\u0627\u0644",
            "\u0645\u0627\u0631\u062a",
            "\u0626\u0627\u067e\u0631\u06d0\u0644",
            "\u0645\u0627\u064a",
            "\u0626\u0649\u064a\u06c7\u0646",
            "\u0626\u0649\u064a\u06c7\u0644",
            "\u0626\u0627\u06cb\u063a\u06c7\u0633\u062a",
            "\u0633\u06d0\u0646\u062a\u06d5\u0628\u0649\u0631",
            "\u0626\u06c6\u0643\u062a\u06d5\u0628\u0649\u0631",
            "\u0646\u0648\u064a\u0627\u0628\u0649\u0631",
            "\u062f\u06d0\u0643\u0627\u0628\u0649\u0631",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "BCE",
            "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5",
        };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0628\u06c7\u062f\u062f\u0627 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649",
        };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
            "BC",
            "BE",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u062c\u06c7\u06ad\u062e\u06c7\u0627 \u0645\u0649\u0646\u06af\u0648\u062f\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
            "\u0645\u0649\u0646\u06af\u0648",
        };
        final String[] metaValue_java_time_roc_Eras = new String[] {
            "Before R.O.C.",
            "\u0645\u0649\u0646\u06af\u0648",
        };
        final String[] metaValue_islamic_MonthNames = new String[] {
            "\u0645\u06c7\u06be\u06d5\u0631\u0631\u06d5\u0645",
            "\u0633\u06d5\u067e\u06d5\u0631",
            "\u0631\u06d5\u0628\u0649\u0626\u06c7\u0644\u0626\u06d5\u06cb\u06cb\u06d5\u0644",
            "\u0631\u06d5\u0628\u0649\u0626\u06c7\u0644\u0626\u0627\u062e\u0649\u0631",
            "\u062c\u06d5\u0645\u0627\u062f\u0649\u064a\u06d5\u0644\u0626\u06d5\u06cb\u06cb\u06d5\u0644",
            "\u062c\u06d5\u0645\u0627\u062f\u0649\u064a\u06d5\u0644\u0626\u0627\u062e\u0649\u0631",
            "\u0631\u06d5\u062c\u06d5\u0628",
            "\u0634\u06d5\u0626\u0628\u0627\u0646",
            "\u0631\u0627\u0645\u0649\u0632\u0627\u0646",
            "\u0634\u06d5\u06cb\u06cb\u0627\u0644",
            "\u0632\u06c7\u0644\u0642\u06d5\u0626\u062f\u06d5",
            "\u0632\u06c7\u0644\u06be\u06d5\u062c\u062c\u06d5",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u06be\u0649\u062c\u0631\u0649\u064a\u06d5",
        };
        final String metaValue_calendarname_gregorian = "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "calendarname.islamic-civil", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649 (\u0645\u06d5\u062f\u0649\u0646\u06d5)" },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "field.minute", "\u0645\u0649\u0646\u06c7\u062a" },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "field.second", "\u0633\u06d0\u0643\u06c7\u0646\u062a" },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMd", "M/d/y GGGGG" },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMEd", "E\u060c M/d/y GGGGG" },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "timezone.regionFormat.daylight", "{0} \u064a\u0627\u0632\u0644\u0649\u0642 \u06cb\u0627\u0642\u062a\u0649" },
            { "DatePatterns",
                new String[] {
                    "y d-MMMM\u060c EEEE",
                    "d-MMMM\u060c y",
                    "d-MMM\u060c y",
                    "y-MM-dd",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d\u060c y G",
                    "MMMM d\u060c y G",
                    "MMM d\u060c y G",
                    "M/d/y GGGGG",
                }
            },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "timezone.regionFormat.standard", "{0} \u0626\u06c6\u0644\u0686\u06d5\u0645\u0644\u0649\u0643 \u06cb\u0627\u0642\u062a\u0649" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u064a\u0627\u067e\u0648\u0646\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5\u062f\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
                    "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5",
                }
            },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d\u060c y GGGG",
                    "MMMM d\u060c y GGGG",
                    "MMM d\u060c y GGGG",
                    "M/d/y G",
                }
            },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "field.era", "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5" },
            { "field.dayperiod", "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646/\u0686\u06c8\u0634\u062a\u0649\u0646 \u0643\u06d0\u064a\u0649\u0646" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "\u0626\u0627\u064a" },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_Eras },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "field.weekday", "\u06be\u06d5\u067e\u062a\u06d5 \u0643\u06c8\u0646\u0644\u0649\u0631\u0649" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", "E\u060c MMM d\u060c y G" },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u0645\u0649\u06ad other:0\u0645\u0649\u06ad}",
                    "{one:00\u0645\u0649\u06ad other:00\u0645\u0649\u06ad}",
                    "{one:000\u0645\u0649\u06ad other:000\u0645\u0649\u06ad}",
                    "{one:0\u0645\u0649\u0644\u064a\u0648\u0646 other:0\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00\u0645\u0649\u0644\u064a\u0648\u0646 other:00\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000\u0645\u0649\u0644\u064a\u0648\u0646 other:000\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:0\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:0\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:00\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:00\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:000\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:000\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:0T other:0T}",
                    "{one:00T other:00T}",
                    "{one:000T other:000T}",
                }
            },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "\u0633\u0627\u0626\u06d5\u062a" },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u0628\u06c7\u062f\u062f\u0627 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "calendarname.islamic-umalqura", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649 (\u0626\u06c7\u0645 \u0626\u06d5\u0644\u0642\u06c7\u0631\u0627)" },
            { "buddhist.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
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
                    "NaN",
                    "",
                    "",
                }
            },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yyyyMEd", "E\u060c d/\u200fM/\u200fy G" },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y GGGG",
                    "d MMMM\u060c y GGGG",
                    "d MMM\u060c y GGGG",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "calendarname.islamic", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "{0} \u06cb\u0627\u0642\u062a\u0649" },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.DateFormatItem.yyyyMd", "d\u200f/M\u200f/y G" },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "field.year", "\u064a\u0649\u0644" },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "calendarname.roc", "\u0645\u0649\u0646\u06af\u0648 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "generic.DateFormatItem.yyyyM", "M/y GGGGG" },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "japanese.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u0645\u0649\u06ad other:0' '\u0645\u0649\u06ad}",
                    "{one:00' '\u0645\u0649\u06ad other:00' '\u0645\u0649\u06ad}",
                    "{one:000' '\u0645\u0649\u06ad other:000' '\u0645\u0649\u06ad}",
                    "{one:0' '\u0645\u0649\u0644\u064a\u0648\u0646 other:0' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00' '\u0645\u0649\u0644\u064a\u0648\u0646 other:00' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000' '\u0645\u0649\u0644\u064a\u0648\u0646 other:000' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:0' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:0' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:00' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:00' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:000' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:000' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:0' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:0' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:00' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:000' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "field.zone", "\u06cb\u0627\u0642\u0649\u062a \u0631\u0627\u064a\u0648\u0646\u0649" },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yyyyM", "M\u200f/y G" },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "generic.DateFormatItem.yyyyMMMd", "MMM d\u060c y G" },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y G",
                    "d MMMM\u060c y G",
                    "d MMM\u060c y G",
                    "d\u200f/M\u200f/y GGGGG",
                }
            },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "\u06be\u06d5\u067e\u062a\u06d5" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "PluralRules", "one:n = 1" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
