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

public class FormatData_ksh extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "Sunndaach",
            "Mohndaach",
            "Dinnsdaach",
            "Metwoch",
            "Dunnersdaach",
            "Friidaach",
            "Samsdaach",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Su.",
            "Mo.",
            "Di.",
            "Me.",
            "Du.",
            "Fr.",
            "Sa.",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "S",
            "M",
            "D",
            "M",
            "D",
            "F",
            "S",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1. Quattahl",
            "2. Quattahl",
            "3. Quattahl",
            "4. Quattahl",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1.Q.",
            "2.Q.",
            "3.Q.",
            "4.Q.",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "Uhr v\u00f6rmiddaachs",
            "Uhr nommendaachs",
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
            "v.M.",
            "n.M.",
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
            "EEEE, 'd\u00e4' d. MMMM y G",
            "d. MMMM y G",
            "d. MMM. y G",
            "d. M. y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, 'd\u00e4' d. MMMM y GGGG",
            "d. MMMM y GGGG",
            "d. MMM. y GGGG",
            "d. M. y G",
        };
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQy";
        final String metaValue_generic_DateFormatItem_Hm = "H:mm";
        final String metaValue_generic_DateFormatItem_MMMMd = "d. MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d. MMM";
        final String metaValue_generic_DateFormatItem_MMMd = "d. MMM";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E d. MMM. y";
        final String metaValue_generic_DateFormatItem_yMEd = "E y-MM-dd";
        final String metaValue_generic_DateFormatItem_yMMMd = "d. MMM. y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Ed = "E 'd\u00e4' d.";
        final String metaValue_generic_DateFormatItem_MEd = "E d. M.";
        final String metaValue_generic_DateFormatItem_Hms = "H:mm:ss";
        final String metaValue_generic_DateFormatItem_yMd = "y-MM-dd";
        final String metaValue_generic_DateFormatItem_yM = "Y-MM";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthNames = new String[] {
            "Jannewa",
            "F\u00e4browa",
            "M\u00e4\u00e4z",
            "Aprell",
            "Mai",
            "Juuni",
            "Juuli",
            "Oujo\u00df",
            "Sept\u00e4mber",
            "Oktohber",
            "Nov\u00e4mber",
            "Dez\u00e4mber",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Jan",
            "F\u00e4b",
            "M\u00e4z",
            "Apr",
            "Mai",
            "Jun",
            "Jul",
            "Ouj",
            "S\u00e4p",
            "Okt",
            "Nov",
            "Dez",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "J",
            "F",
            "M",
            "A",
            "M",
            "J",
            "J",
            "O",
            "S",
            "O",
            "N",
            "D",
            "",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_calendarname_gregorian = "jrejorejahnesche Kal\u00e4nnder";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "calendarname.islamic-civil", "w\u00e4ltlesche islaamesche Kal\u00e4nder" },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "\u00d710^",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.minute", "Menutt" },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "field.second", "Sekond" },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "calendarname.islamic", "i\u00dflaamesche Kal\u00e4nder" },
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
                    "Jan.",
                    "F\u00e4b.",
                    "M\u00e4z.",
                    "Apr.",
                    "Mai",
                    "Jun.",
                    "Jul.",
                    "Ouj.",
                    "S\u00e4p.",
                    "Okt.",
                    "Nov.",
                    "Dez.",
                    "",
                }
            },
            { "timezone.regionFormat", "Zick vun {0}" },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "standalone.QuarterNarrows",
                new String[] {
                    "1Q",
                    "2Q",
                    "3Q",
                    "4Q",
                }
            },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. MMM. y GGGG",
                    "d. M. y G",
                }
            },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.MonthNames", metaValue_MonthNames },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y G",
                    "d. MMMM y G",
                    "d. MMM. y G",
                    "d. M. y GGGGG",
                }
            },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "timezone.regionFormat.daylight", "Summerzick vun {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE, 'd\u00e4' d. MMMM y",
                    "d. MMMM y",
                    "d. MMM. y",
                    "d. M. y",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "field.year", "Johr" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras",
                new String[] {
                    "vC",
                    "nC",
                }
            },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "timezone.regionFormat.standard", "Schtandattzick vun {0}" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "calendarname.japanese", "japaanesche Kal\u00e4nder" },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "long.Eras",
                new String[] {
                    "v\u00fcr Krestos",
                    "noh Krestos",
                }
            },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "generic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "field.era", "\u00c4hra" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "field.dayperiod", "Daachteil" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.roc", "rotschineesesche Kal\u00e4nder" },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "Mohnd" },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{zero:0' 'Dousend one:0' 'Dousend other:0' 'Dousend}",
                    "{zero:00' 'Dousend one:00' 'Dousend other:00' 'Dousend}",
                    "{zero:000' 'Dousend one:000' 'Dousend other:000' 'Dousend}",
                    "{zero:0' 'Milljuhne one:0' 'Million other:0' 'Milljuhne}",
                    "{zero:00' 'Milljuhne one:00' 'Milljuhne other:00' 'Millionen}",
                    "{zero:000' 'Milljuhne one:000' 'Milljuhne other:000' 'Millionen}",
                    "{zero:0' 'Milljard one:0' 'Milliarde other:0' 'Milljarde}",
                    "{zero:00' 'Milljarde one:00' 'Milljarde other:00' 'Milliarden}",
                    "{zero:000' 'Milljarde one:000' 'Milliarde other:000' 'Milliarden}",
                    "{zero:0' 'Billjuhn one:0' 'Billjuhn other:0' 'Billjuhn}",
                    "{zero:00' 'Billjuhn one:00' 'Billion other:00' 'Billionen}",
                    "{zero:000' 'Billjuhn one:000' 'Billion other:000' 'Billionen}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "field.zone", "Zickzohn" },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras",
                new String[] {
                    "v. Chr.",
                    "n. Chr.",
                }
            },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "field.weekday", "Wochedaach" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "field.week", "Woch" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{zero:0\u00a0tsd one:0\u00a0tsd other:0\u00a0tsd}",
                    "{zero:00\u00a0tsd one:00\u00a0tsd other:00\u00a0tsd}",
                    "{zero:000\u00a0tsd one:000\u00a0tsd other:000\u00a0tsd}",
                    "{zero:0\u00a0Mio one:0\u00a0Mio other:0\u00a0Mio}",
                    "{zero:00\u00a0Mio one:00\u00a0Mio other:00\u00a0Mio}",
                    "{zero:000\u00a0Mio one:000\u00a0Mio other:000\u00a0Mio}",
                    "{zero:0\u00a0Mrd one:0\u00a0Mrd other:0\u00a0Mrd}",
                    "{zero:00\u00a0Mrd one:00\u00a0Mrd other:00\u00a0Mrd}",
                    "{zero:000\u00a0Mrd one:000\u00a0Mrd other:000\u00a0Mrd}",
                    "{zero:0\u00a0Bio one:0\u00a0Bio other:0\u00a0Bio}",
                    "{zero:00\u00a0Bio one:00\u00a0Bio other:00\u00a0Bio}",
                    "{zero:000\u00a0Bio one:000\u00a0Bio other:000\u00a0Bio}",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "PluralRules", "zero:n = 0;one:n = 1" },
            { "buddhist.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "field.hour", "Schtund" },
            { "calendarname.buddhist", "buddistesche Kal\u00e4nder" },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "",
                }
            },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
