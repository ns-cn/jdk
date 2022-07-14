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

public class FormatData_os extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0445\u0443\u044b\u0446\u0430\u0443\u0431\u043e\u043d",
            "\u043a\u044a\u0443\u044b\u0440\u0438\u0441\u04d5\u0440",
            "\u0434\u044b\u0446\u0446\u04d5\u0433",
            "\u04d5\u0440\u0442\u044b\u0446\u0446\u04d5\u0433",
            "\u0446\u044b\u043f\u043f\u04d5\u0440\u04d5\u043c",
            "\u043c\u0430\u0439\u0440\u04d5\u043c\u0431\u043e\u043d",
            "\u0441\u0430\u0431\u0430\u0442",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u0445\u0446\u0431",
            "\u043a\u0440\u0441",
            "\u0434\u0446\u0433",
            "\u04d5\u0440\u0442",
            "\u0446\u043f\u0440",
            "\u043c\u0440\u0431",
            "\u0441\u0431\u0442",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u0425",
            "\u041a",
            "\u0414",
            "\u04d4",
            "\u0426",
            "\u041c",
            "\u0421",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1-\u0430\u0433 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "2-\u0430\u0433 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "3-\u0430\u0433 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "4-\u04d5\u043c \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1-\u0430\u0433 \u043a\u0432.",
            "2-\u0430\u0433 \u043a\u0432.",
            "3-\u0430\u0433 \u043a\u0432.",
            "4-\u04d5\u043c \u043a\u0432.",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u04d5\u043c\u0431\u0438\u0441\u0431\u043e\u043d\u044b \u0440\u0430\u0437\u043c\u04d5",
            "\u04d5\u043c\u0431\u0438\u0441\u0431\u043e\u043d\u044b \u0444\u04d5\u0441\u0442\u04d5",
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
            "AM",
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
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y '\u0430\u0437' G",
            "d MMMM, y '\u0430\u0437' G",
            "dd MMM y '\u0430\u0437' G",
            "dd.MM.yy GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y '\u0430\u0437' GGGG",
            "d MMMM, y '\u0430\u0437' GGGG",
            "dd MMM y '\u0430\u0437' GGGG",
            "dd.MM.yy G",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1}, {0}",
            "{1}, {0}",
            "{1}, {0}",
            "{1}, {0}",
        };
        final String metaValue_generic_DateFormatItem_yQQQ = "y-'\u04d5\u043c' '\u0430\u0437\u044b' QQQ";
        final String metaValue_generic_DateFormatItem_MMMEd = "ccc, d MMM";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, dd.MM.y";
        final String metaValue_generic_DateFormatItem_yMMM = "LLL y";
        final String metaValue_generic_DateFormatItem_Md = "dd.MM";
        final String metaValue_generic_DateFormatItem_MEd = "E, dd.MM";
        final String metaValue_generic_DateFormatItem_yM = "MM.y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "y-'\u04d5\u043c' '\u0430\u0437\u044b' QQQQ";
        final String[] metaValue_MonthNames = new String[] {
            "\u044f\u043d\u0432\u0430\u0440\u044b",
            "\u0444\u0435\u0432\u0440\u0430\u043b\u044b",
            "\u043c\u0430\u0440\u0442\u044a\u0438\u0439\u044b",
            "\u0430\u043f\u0440\u0435\u043b\u044b",
            "\u043c\u0430\u0439\u044b",
            "\u0438\u044e\u043d\u044b",
            "\u0438\u044e\u043b\u044b",
            "\u0430\u0432\u0433\u0443\u0441\u0442\u044b",
            "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044b",
            "\u043e\u043a\u0442\u044f\u0431\u0440\u044b",
            "\u043d\u043e\u044f\u0431\u0440\u044b",
            "\u0434\u0435\u043a\u0430\u0431\u0440\u044b",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u044f\u043d\u0432.",
            "\u0444\u0435\u0432.",
            "\u043c\u0430\u0440.",
            "\u0430\u043f\u0440.",
            "\u043c\u0430\u0439\u044b",
            "\u0438\u044e\u043d\u044b",
            "\u0438\u044e\u043b\u044b",
            "\u0430\u0432\u0433.",
            "\u0441\u0435\u043d.",
            "\u043e\u043a\u0442.",
            "\u043d\u043e\u044f.",
            "\u0434\u0435\u043a.",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u042f",
            "\u0424",
            "\u041c",
            "\u0410",
            "\u041c",
            "\u0418",
            "\u0418",
            "\u0410",
            "\u0421",
            "\u041e",
            "\u041d",
            "\u0414",
            "",
        };
        final String[] metaValue_long_Eras = new String[] {
            "\u043d.\u0434.\u0430.",
            "\u043d.\u0434.",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String metaValue_calendarname_gregorian = "\u0413\u0440\u0435\u0433\u043e\u0440\u0438\u0430\u043d \u043a\u044a\u04d5\u043b\u0438\u043d\u0434\u0430\u0440";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations",
                new String[] {
                    "\u0425\u0446\u0431",
                    "\u041a\u0440\u0441",
                    "\u0414\u0446\u0433",
                    "\u04d4\u0440\u0442",
                    "\u0426\u043f\u0440",
                    "\u041c\u0440\u0431",
                    "\u0421\u0431\u0442",
                }
            },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
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
                    "\u041d\u041d",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "field.minute", "\u041c\u0438\u043d\u0443\u0442" },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "field.second", "\u0421\u0435\u043a\u0443\u043d\u0434" },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u042f\u043d\u0432.",
                    "\u0424\u0435\u0432\u0440.",
                    "\u041c\u0430\u0440\u0442.",
                    "\u0410\u043f\u0440.",
                    "\u041c\u0430\u0439",
                    "\u0418\u044e\u043d\u044c",
                    "\u0418\u044e\u043b\u044c",
                    "\u0410\u0432\u0433.",
                    "\u0421\u0435\u043d\u0442.",
                    "\u041e\u043a\u0442.",
                    "\u041d\u043e\u044f\u0431.",
                    "\u0414\u0435\u043a.",
                    "",
                }
            },
            { "timezone.regionFormat", "{0} \u0440\u04d5\u0441\u0442\u04d5\u0433" },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM, y '\u0430\u0437'",
                    "d MMMM, y '\u0430\u0437'",
                    "dd MMM y '\u0430\u0437'",
                    "dd.MM.yy",
                }
            },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames",
                new String[] {
                    "\u0425\u0443\u044b\u0446\u0430\u0443\u0431\u043e\u043d",
                    "\u041a\u044a\u0443\u044b\u0440\u0438\u0441\u04d5\u0440",
                    "\u0414\u044b\u0446\u0446\u04d5\u0433",
                    "\u04d4\u0440\u0442\u044b\u0446\u0446\u04d5\u0433",
                    "\u0426\u044b\u043f\u043f\u04d5\u0440\u04d5\u043c",
                    "\u041c\u0430\u0439\u0440\u04d5\u043c\u0431\u043e\u043d",
                    "\u0421\u0430\u0431\u0430\u0442",
                }
            },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "field.year", "\u0410\u0437" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "long.Eras", metaValue_long_Eras },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "field.era", "\u0414\u0443\u0433" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "field.dayperiod", "\u0411\u043e\u043d\u044b \u043f\u0435\u0440\u0438\u043e\u0434" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "\u041c\u04d5\u0439" },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "field.zone", "\u0420\u04d5\u0441\u0442\u04d5\u0434\u0436\u044b \u0437\u043e\u043d\u04d5" },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_long_Eras },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "field.weekday", "\u041a\u044a\u0443\u044b\u0440\u0438\u0439\u044b \u0431\u043e\u043d" },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "\u041a\u044a\u0443\u044b\u0440\u0438" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "PluralRules", "one:n = 1" },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "\u0421\u0430\u0445\u0430\u0442" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "standalone.MonthNames",
                new String[] {
                    "\u042f\u043d\u0432\u0430\u0440\u044c",
                    "\u0424\u0435\u0432\u0440\u0430\u043b\u044c",
                    "\u041c\u0430\u0440\u0442\u044a\u0438",
                    "\u0410\u043f\u0440\u0435\u043b\u044c",
                    "\u041c\u0430\u0439",
                    "\u0418\u044e\u043d\u044c",
                    "\u0418\u044e\u043b\u044c",
                    "\u0410\u0432\u0433\u0443\u0441\u0442",
                    "\u0421\u0435\u043d\u0442\u044f\u0431\u0440\u044c",
                    "\u041e\u043a\u0442\u044f\u0431\u0440\u044c",
                    "\u041d\u043e\u044f\u0431\u0440\u044c",
                    "\u0414\u0435\u043a\u0430\u0431\u0440\u044c",
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
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
