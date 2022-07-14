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

public class FormatData_mni extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u09a8\u09cb\u0982\u09ae\u09be\u0987\u099c\u09bf\u0982",
            "\u09a8\u09bf\u0982\u09a5\u09cc\u0995\u09be\u09ac\u09be",
            "\u09b2\u09c8\u09ac\u09be\u0995\u09aa\u09cb\u0995\u09aa\u09be",
            "\u09af\u09bc\u09c1\u09ae\u09b6\u0995\u09c8\u09b6\u09be",
            "\u09b6\u0997\u09cb\u09b2\u09b6\u09c7\u09a8",
            "\u0987\u09b0\u09be\u0987",
            "\u09a5\u09be\u0982\u099c",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u09a8\u09cb\u0982",
            "\u09a8\u09bf\u0982",
            "\u09b2\u09c8\u09ac\u09be",
            "\u09af\u09bc\u09c1\u09ae",
            "\u09b6\u0997\u09cb",
            "\u0987\u09b0\u09be",
            "\u09a5\u09be\u0982",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0985\u09b9\u09be\u09a8\u09ac\u09be \u09ae\u09b8\u09c1\u0982",
            "\u0985\u09a8\u09c0\u09b6\u09c1\u09ac\u09be \u09ae\u09b8\u09c1\u0982",
            "\u0985\u09b9\u09c1\u09ae\u09b6\u09c1\u09ac\u09be \u09ae\u09b8\u09c1\u0982",
            "\u09ae\u09b0\u09c0\u09b6\u09c1\u09ac\u09be \u09ae\u09b8\u09c1\u0982",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u098f \u098f\u09ae",
            "\u09aa\u09bf \u098f\u09ae",
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
            "\u09a8\u09c1\u09ae\u09be\u0982",
            "PM",
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
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "MMMM d, y G, EEEE",
            "MMMM d, y G",
            "MMM d, y G",
            "M/d/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "MMMM d, y GGGG, EEEE",
            "MMMM d, y GGGG",
            "MMM d, y GGGG",
            "M/d/y G",
        };
        final String metaValue_generic_DateFormatItem_yQQQ = "y QQQ";
        final String metaValue_generic_DateFormatItem_GyMd = "GGGGG dd-MM-y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "MMM d, y, E";
        final String metaValue_generic_DateFormatItem_yMEd = "d/M/y, E";
        final String metaValue_generic_DateFormatItem_yMMMd = "MMM d, y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_MEd = "d/M, E";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String[] metaValue_MonthNames = new String[] {
            "\u099c\u09be\u09a8\u09c1\u09f1\u09be\u09b0\u09bf",
            "\u09ab\u09c7\u09ac\u09cd\u09b0\u09c1\u09f1\u09be\u09b0\u09bf",
            "\u09ae\u09be\u09b0\u09cd\u099a",
            "\u098f\u09aa\u09cd\u09b0\u09bf\u09b2",
            "\u09ae\u09c7",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2\u09be\u0987",
            "\u0986\u0997\u09b8\u09cd\u099f",
            "\u09b8\u09c7\u09aa\u09cd\u099f\u09c7\u09ae\u09cd\u09ac\u09b0",
            "\u0993\u0995\u09cd\u099f\u09cb\u09ac\u09b0",
            "\u09a8\u09ad\u09c7\u09ae\u09cd\u09ac\u09b0",
            "\u09a1\u09bf\u09b8\u09c7\u09ae\u09cd\u09ac\u09b0",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u099c\u09be",
            "\u09ab\u09c7",
            "\u09ae\u09be\u09b0",
            "\u098f\u09aa",
            "\u09ae\u09c7",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2",
            "\u0986",
            "\u09b8\u09c7",
            "\u0993\u0995",
            "\u09a8\u09ac",
            "\u09a1\u09bf",
            "",
        };
        final String[] metaValue_long_Eras = new String[] {
            "\u0996\u09c3: \u09ae\u09ae\u09be\u0982",
            "\u0996\u09c3: \u09ae\u09a4\u09c1\u0982",
        };
        final String metaValue_buddhist_DateFormatItem_MMMMd = "MMMM d";
        final String metaValue_buddhist_DateFormatItem_MMMEd = "MMM d, E";
        final String metaValue_buddhist_DateFormatItem_MMMd = "MMM d";
        final String metaValue_buddhist_DateFormatItem_GyMMM = "G y MMM";
        final String metaValue_buddhist_DateFormatItem_GyMMMd = "G y MMM d";
        final String metaValue_buddhist_DateFormatItem_GyMMMEd = "G y MMM d, E";
        final String metaValue_calendarname_gregorian = "\u0997\u09cd\u09b0\u09bf\u0997\u09cb\u09b0\u09bf\u09af\u09bc\u09be\u09a8 \u0995\u09c7\u09b2\u09c7\u09a8\u09cd\u09a6\u09b0";
        final Object[][] data = new Object[][] {
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "MonthNames", metaValue_MonthNames },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "timezone.gmtZeroFormat", "\u099c\u09bf \u098f\u09ae \u099f\u09bf" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "roc.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "DateTimePatterns",
                new String[] {
                    "{1} \u0997\u09c0 {0} \u09a6\u09be",
                    "{1} \u0997\u09c0 {0} \u09a6\u09be",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
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
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.minute", "\u09ae\u09bf\u09a8\u099f" },
            { "japanese.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.MonthNarrows",
                new String[] {
                    "\u099c\u09be",
                    "\u09ab\u09c7",
                    "\u09ae\u09be\u09b0",
                    "\u098f\u09aa",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2",
                    "\u0986",
                    "\u09b8\u09c7",
                    "\u0993",
                    "\u09a8\u09ac",
                    "\u09a1\u09bf",
                    "",
                }
            },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "field.second", "\u09b8\u09c7\u0995\u09c7\u09a3\u09cd\u09a1" },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u099c\u09be\u09a8\u09c1",
                    "\u09ab\u09c7\u09ac\u09cd\u09b0\u09c1",
                    "\u09ae\u09be\u09b0",
                    "\u098f\u09aa\u09cd\u09b0\u09bf",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2\u09be",
                    "\u0986\u0997",
                    "\u09b8\u09c7\u09aa\u09cd\u099f",
                    "\u0993\u0995\u09cd\u099f\u09cb",
                    "\u09a8\u09ad\u09c7",
                    "\u09a1\u09bf\u09b8\u09c7",
                    "",
                }
            },
            { "timezone.regionFormat", "{0} \u099f\u09be\u0987\u09ae" },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "roc.DayAbbreviations", metaValue_generic_DayNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "DayNames", metaValue_generic_DayNames },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "timezone.regionFormat.daylight", "{0} (+1) \u09a6\u09c7\u09b2\u09be\u0987\u099f \u099f\u09be\u0987\u09ae" },
            { "DatePatterns",
                new String[] {
                    "MMMM d, y, EEEE",
                    "MMMM d, y",
                    "MMM d, y",
                    "d/M/yy",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "field.year", "\u099a\u09b9\u09c0" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "timezone.gmtFormat", "\u099c\u09bf \u098f\u09ae \u099f\u09bf {0}" },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "timezone.regionFormat.standard", "{0} (+0) \u09b7\u09cd\u099f\u09c7\u09a8\u09cd\u09a6\u09b0\u09cd\u09a6 \u099f\u09be\u0987\u09ae" },
            { "DefaultNumberingSystem", "beng" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "long.Eras", metaValue_long_Eras },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "field.era", "\u099a\u0995" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "field.dayperiod", "\u098f \u098f\u09ae/\u09aa\u09bf \u098f\u09ae" },
            { "buddhist.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "field.month", "\u09a5\u09be" },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.DayNarrows",
                new String[] {
                    "\u09a8\u09cb",
                    "\u09a8\u09bf\u0982",
                    "\u09b2\u09c8",
                    "\u09af\u09bc\u09c1\u09ae",
                    "\u09b6\u0997",
                    "\u0987\u09b0\u09be",
                    "\u09a5\u09be\u0982",
                }
            },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1} \u0997\u09c0 {0} \u09a6\u09be",
                    "{1} \u0997\u09c0 {0} \u09a6\u09be",
                    "{1} {0}",
                    "{1}, {0}",
                }
            },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.zone", "\u099f\u09be\u0987\u09ae \u099c\u09cb\u09a8" },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_long_Eras },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "field.weekday", "\u099a\u09af\u09bc\u09cb\u09b2\u0997\u09c0 \u09a8\u09c1\u09ae\u09bf\u09ce" },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMEd", metaValue_buddhist_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "field.week", "\u099a\u09af\u09bc\u09cb\u09b2" },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "field.hour", "\u09aa\u09c1\u0982" },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthNames",
                new String[] {
                    "\u099c\u09be\u09a8\u09c1\u09f1\u09be\u09b0\u09bf",
                    "\u09ab\u09c7\u09ac\u09cd\u09b0\u09c1\u09f1\u09be\u09b0\u09bf",
                    "\u09ae\u09be\u09b0\u09cd\u099a",
                    "\u098f\u09aa\u09cd\u09b0\u09bf\u09b2",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2\u09be\u0987",
                    "\u0993\u0997\u09b7\u09cd\u099f",
                    "\u09b8\u09c7\u09aa\u09cd\u099f\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "\u0993\u0995\u09cd\u099f\u09cb\u09ac\u09b0",
                    "\u09a8\u09ac\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "\u09a1\u09bf\u09b8\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
        };
        return data;
    }
}
