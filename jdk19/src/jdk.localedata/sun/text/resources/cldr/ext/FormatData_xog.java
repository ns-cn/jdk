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

public class FormatData_xog extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "Sabiiti",
            "Balaza",
            "Owokubili",
            "Owokusatu",
            "Olokuna",
            "Olokutaanu",
            "Olomukaaga",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Sabi",
            "Bala",
            "Kubi",
            "Kusa",
            "Kuna",
            "Kuta",
            "Muka",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "S",
            "B",
            "B",
            "S",
            "K",
            "K",
            "M",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "Ebisera ebyomwaka ebisoka",
            "Ebisera ebyomwaka ebyokubiri",
            "Ebisera ebyomwaka ebyokusatu",
            "Ebisera ebyomwaka ebyokuna",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "Q1",
            "Q2",
            "Q3",
            "Q4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "Munkyo",
            "Eigulo",
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
            "EEEE, d MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "dd/MM/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "dd/MM/y G",
        };
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E, MMMM d";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, MMM d";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, MMM d, y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, M/d/y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "M/d";
        final String metaValue_generic_DateFormatItem_MEd = "E, M/d";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthNames = new String[] {
            "Janwaliyo",
            "Febwaliyo",
            "Marisi",
            "Apuli",
            "Maayi",
            "Juuni",
            "Julaayi",
            "Agusito",
            "Sebuttemba",
            "Okitobba",
            "Novemba",
            "Desemba",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Jan",
            "Feb",
            "Mar",
            "Apu",
            "Maa",
            "Juu",
            "Jul",
            "Agu",
            "Seb",
            "Oki",
            "Nov",
            "Des",
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
            "A",
            "S",
            "O",
            "N",
            "D",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "AZ",
            "AF",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_MMMMd = "MMMM d";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_MMMd = "MMM d";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
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
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "field.minute", "Edakiika" },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "field.second", "Obutikitiki" },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
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
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/y",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "field.year", "Omwaka" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "long.Eras",
                new String[] {
                    "Kulisto nga azilawo",
                    "Kulisto nga affile",
                }
            },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "field.era", "Emulembe" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "field.dayperiod", "munkyo/Eigulo" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "Omwezi" },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "field.zone", "Essawa edha" },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_Eras },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "field.weekday", "Olunaka lwa sabiiti" },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "Esabiiti" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "PluralRules", "one:n = 1" },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "Essawa" },
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
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
