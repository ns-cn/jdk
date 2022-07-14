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

public class FormatData_pt_PT extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "domingo",
            "segunda",
            "ter\u00e7a",
            "quarta",
            "quinta",
            "sexta",
            "s\u00e1bado",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1.\u00ba trimestre",
            "2.\u00ba trimestre",
            "3.\u00ba trimestre",
            "4.\u00ba trimestre",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "da manh\u00e3",
            "da tarde",
            "meia-noite",
            "meio-dia",
            "da manh\u00e3",
            "",
            "da tarde",
            "",
            "da noite",
            "",
            "da madrugada",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a.m.",
            "p.m.",
            "meia-noite",
            "meio-dia",
            "manh\u00e3",
            "",
            "tarde",
            "",
            "noite",
            "",
            "madrugada",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "a.m.",
            "p.m.",
            "meia-noite",
            "meio-dia",
            "da manh\u00e3",
            "",
            "da tarde",
            "",
            "da noite",
            "",
            "da madrugada",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y G",
            "d 'de' MMMM 'de' y G",
            "d 'de' MMM 'de' y G",
            "d/M/y G",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y GGGG",
            "d 'de' MMMM 'de' y GGGG",
            "d 'de' MMM 'de' y GGGG",
            "d/M/y GGGG",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} '\u00e0s' {0}",
            "{1} '\u00e0s' {0}",
            "{1}, {0}",
            "{1}, {0}",
        };
        final String metaValue_generic_DateFormatItem_yyyyQQQQ = "QQQQ 'de' y G";
        final String metaValue_generic_DateFormatItem_yw = "w.'\u00aa' 'semana' 'de' Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQQ 'de' y";
        final String metaValue_generic_DateFormatItem_yMMMMEd = "ccc, d 'de' MMMM 'de' y";
        final String metaValue_generic_DateFormatItem_MMMMEd = "ccc, d 'de' MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, d/MM";
        final String metaValue_generic_DateFormatItem_MMMd = "d/MM";
        final String metaValue_generic_DateFormatItem_MMMMW = "W.'\u00aa' 'semana' 'de' MMMM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d/MM/y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d/MM/y";
        final String metaValue_generic_DateFormatItem_yMMM = "MM/y";
        final String metaValue_generic_DateFormatItem_yMMMEEEEd = "EEEE, d/MM/y";
        final String metaValue_generic_DateFormatItem_Md = "dd/MM";
        final String metaValue_timezone_regionFormat_daylight = "Hora padr\u00e3o de {0}";
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "BE",
        };
        final String metaValue_calendarname_gregorian = "Calend\u00e1rio gregoriano";
        final Object[][] data = new Object[][] {
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "calendarname.islamic-umalqura", "Calend\u00e1rio isl\u00e2mico (Umm al-Qura)" },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "calendarname.islamic-civil", "Calend\u00e1rio isl\u00e2mico (civil)" },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", metaValue_timezone_regionFormat_daylight },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "Calend\u00e1rio japon\u00eas" },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "japanese.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
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
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "field.dayperiod", "am/pm" },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateFormatItem.yyyyQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DateFormatItem.yyyyQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "calendarname.islamic", "Calend\u00e1rio isl\u00e2mico" },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "timezone.regionFormat", "Hora de {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'mil other:0' 'mil}",
                    "{one:00' 'mil other:00' 'mil}",
                    "{one:000' 'mil other:000' 'mil}",
                    "{one:0' 'milh\u00e3o other:0' 'milh\u00f5es}",
                    "{one:00' 'milh\u00f5es other:00' 'milh\u00f5es}",
                    "{one:000' 'milh\u00f5es other:000' 'milh\u00f5es}",
                    "{one:0' 'mil' 'milh\u00f5es other:0' 'mil' 'milh\u00f5es}",
                    "{one:00' 'mil' 'milh\u00f5es other:00' 'mil' 'milh\u00f5es}",
                    "{one:000' 'mil' 'milh\u00f5es other:000' 'mil' 'milh\u00f5es}",
                    "{one:0' 'bili\u00e3o other:0' 'bili\u00f5es}",
                    "{one:00' 'bili\u00f5es other:00' 'bili\u00f5es}",
                    "{one:000' 'bili\u00f5es other:000' 'bili\u00f5es}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic-civil.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", "d/MM/y G" },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMMM", "MM/y G" },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.yyyyMMMEd", "E, d/MM/y G" },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DateFormatItem.yyyyMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0mil other:0\u00a0mil}",
                    "{one:00\u00a0mil other:00\u00a0mil}",
                    "{one:000\u00a0mil other:000\u00a0mil}",
                    "{one:0\u00a0M other:0\u00a0M}",
                    "{one:00\u00a0M other:00\u00a0M}",
                    "{one:000\u00a0M other:000\u00a0M}",
                    "{one:0\u00a0mM other:0\u00a0mM}",
                    "{one:00\u00a0mM other:00\u00a0mM}",
                    "{one:000\u00a0mM other:000\u00a0mM}",
                    "{one:0\u00a0Bi other:0\u00a0Bi}",
                    "{one:00\u00a0Bi other:00\u00a0Bi}",
                    "{one:000\u00a0Bi other:000\u00a0Bi}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", metaValue_timezone_regionFormat_daylight },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "dd/MM/y",
                    "dd/MM/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "PluralRules", "one:i = 1 and v = 0;many:e = 0 and i != 0 and i % 1000000 = 0 and v = 0 or e != 0..5" },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "calendarname.buddhist", "Calend\u00e1rio budista" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a0\u00a4;(#,##0.00\u00a0\u00a4)",
                }
            },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
