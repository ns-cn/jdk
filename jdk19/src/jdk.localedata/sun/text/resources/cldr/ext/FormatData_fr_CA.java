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

public class FormatData_fr_CA extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "a.m.",
            "p.m.",
            "minuit",
            "midi",
            "du matin",
            "",
            "de l\u2019apr\u00e8s-midi",
            "",
            "du soir",
            "",
            "du matin",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a",
            "p",
            "minuit",
            "midi",
            "mat.",
            "",
            "apr\u00e8s-midi",
            "",
            "soir",
            "",
            "mat.",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "a.m.",
            "p.m.",
            "minuit",
            "midi",
            "du mat.",
            "",
            "apr\u00e8s-midi",
            "",
            "du soir",
            "",
            "du mat.",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH 'h' mm 'min' ss 's' zzzz",
            "HH 'h' mm 'min' ss 's' z",
            "HH 'h' mm 'min' ss 's'",
            "HH 'h' mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE d MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "yy-MM-dd GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE d MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "yy-MM-dd G",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "MM-dd";
        final String metaValue_generic_DateFormatItem_hm = "h 'h' mm a";
        final String metaValue_generic_DateFormatItem_Ehms = "E h 'h' mm 'min' ss 's' a";
        final String metaValue_generic_DateFormatItem_Ehm = "E h 'h' mm a";
        final String metaValue_generic_DateFormatItem_yMEd = "E y-MM-dd";
        final String metaValue_generic_DateFormatItem_hms = "h 'h' mm 'min' ss 's' a";
        final String metaValue_generic_DateFormatItem_hmv = "h 'h' mm a v";
        final String metaValue_generic_DateFormatItem_Bhms = "h 'h' mm 'min' ss 's' B";
        final String metaValue_generic_DateFormatItem_hmsv = "h 'h' mm 'min' ss 's' a v";
        final String metaValue_generic_DateFormatItem_Hm = "HH 'h' mm";
        final String metaValue_generic_DateFormatItem_ms = "mm 'min' ss 's'";
        final String metaValue_generic_DateFormatItem_EHms = "E HH 'h' mm 'min' ss 's'";
        final String metaValue_generic_DateFormatItem_EHm = "E HH 'h' mm";
        final String metaValue_generic_DateFormatItem_Md = "M-d";
        final String metaValue_generic_DateFormatItem_EBhms = "E h 'h' mm 'min' ss 's' B";
        final String metaValue_generic_DateFormatItem_yyyyMM = "y-MM G";
        final String metaValue_generic_DateFormatItem_EBhm = "E h 'h' mm B";
        final String metaValue_generic_DateFormatItem_MMd = "MM-d";
        final String metaValue_generic_DateFormatItem_Bhm = "h 'h' mm B";
        final String metaValue_generic_DateFormatItem_MEd = "E M-d";
        final String metaValue_generic_DateFormatItem_yMM = "y-MM";
        final String metaValue_generic_DateFormatItem_Bh = "h 'h' B";
        final String metaValue_generic_DateFormatItem_h = "h 'h' a";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH 'h' mm 'min' ss 's' v";
        final String metaValue_generic_DateFormatItem_GyMd = "y-MM-dd GGGGG";
        final String metaValue_generic_DateFormatItem_Hms = "HH 'h' mm 'min' ss 's'";
        final String metaValue_generic_DateFormatItem_Hmv = "HH 'h' mm v";
        final String metaValue_generic_DateFormatItem_yMd = "y-MM-dd";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "janv.",
            "f\u00e9vr.",
            "mars",
            "avr.",
            "mai",
            "juin",
            "juill.",
            "ao\u00fbt",
            "sept.",
            "oct.",
            "nov.",
            "d\u00e9c.",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "Anno Hegirae",
        };
        final String[] metaValue_java_time_islamic_narrow_Eras = new String[] {
            "",
            "AH",
        };
        final Object[][] data = new Object[][] {
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "calendarname.islamic-umalqura", "calendrier musulman (calcul\u00e9, Umm al-Qura)" },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "generic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "roc.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "DateTimePatterns",
                new String[] {
                    "{1} '\u00e0' {0}",
                    "{1} '\u00e0' {0}",
                    "{1}, {0}",
                    "{1} {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
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
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.yyyyMEd", "E y-MM-dd GGGGG" },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "y-MM-dd G",
                }
            },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "japanese.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "generic.DateFormatItem.yyyyMM", metaValue_generic_DateFormatItem_yyyyMM },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyMd", "y-MM-dd G" },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMEd", "E y-MM-dd G" },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "timezone.regionFormat.daylight", "{0} (heure avanc\u00e9e)" },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "y-MM-dd",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "timezone.regionFormat.standard", "{0} (heure normale)" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_narrow_Eras },
            { "japanese.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyMM },
            { "islamic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{1:0' 'mille one:0' 'mille other:0' 'mille}",
                    "{one:00' 'mille other:00' 'mille}",
                    "{one:000' 'mille other:000' 'mille}",
                    "{one:0' 'million other:0' 'millions}",
                    "{one:00' 'million other:00' 'millions}",
                    "{one:000' 'million other:000' 'millions}",
                    "{one:0' 'milliard other:0' 'milliards}",
                    "{one:00' 'milliard other:00' 'milliards}",
                    "{one:000' 'milliard other:000' 'milliards}",
                    "{one:0' 'billion other:0' 'billions}",
                    "{one:00' 'billion other:00' 'billions}",
                    "{one:000' 'billion other:000' 'billions}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "generic.DateFormatItem.H", "HH 'h'" },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1} '\u00e0' {0}",
                    "{1} '\u00e0' {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yyyyM", "y-MM GGGGG" },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic-civil.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "y-MM-dd GGGGG",
                }
            },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0k other:0\u00a0k}",
                    "{one:00\u00a0k other:00\u00a0k}",
                    "{one:000\u00a0k other:000\u00a0k}",
                    "{one:0\u00a0M other:0\u00a0M}",
                    "{one:00\u00a0M other:00\u00a0M}",
                    "{one:000\u00a0M other:000\u00a0M}",
                    "{one:0\u00a0G other:0\u00a0G}",
                    "{one:00\u00a0G other:00\u00a0G}",
                    "{one:000\u00a0G other:000\u00a0G}",
                    "{one:0\u00a0T other:0\u00a0T}",
                    "{one:00\u00a0T other:00\u00a0T}",
                    "{one:000\u00a0T other:000\u00a0T}",
                }
            },
            { "islamic-umalqura.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "generic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "roc.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_narrow_Eras },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4;(#,##0.00\u00a0\u00a4)",
                }
            },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
        };
        return data;
    }
}
