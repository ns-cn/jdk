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

public class FormatData_nn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "s\u00f8ndag",
            "m\u00e5ndag",
            "tysdag",
            "onsdag",
            "torsdag",
            "fredag",
            "laurdag",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "s\u00f8.",
            "m\u00e5.",
            "ty.",
            "on.",
            "to.",
            "fr.",
            "la.",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "S",
            "M",
            "T",
            "O",
            "T",
            "F",
            "L",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "midnatt",
            "",
            "p\u00e5 morgonen",
            "p\u00e5 formiddagen",
            "p\u00e5 ettermiddagen",
            "",
            "p\u00e5 kvelden",
            "",
            "p\u00e5 natta",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "f.m.",
            "e.m.",
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
            "'kl'. HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE d. MMMM y G",
            "d. MMMM y G",
            "d. MMM y G",
            "d.M.y G",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE d. MMMM y GGGG",
            "d. MMMM y GGGG",
            "d. MMM y GGGG",
            "d.M.y GGGG",
        };
        final String metaValue_generic_DateFormatItem_yw = "'veke' w 'i' Y";
        final String metaValue_generic_DateFormatItem_MMMMW = "'veke' W 'i' MMMM";
        final String metaValue_generic_DateFormatItem_MEd = "E d.M";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "jan.",
            "feb.",
            "mars",
            "apr.",
            "mai",
            "juni",
            "juli",
            "aug.",
            "sep.",
            "okt.",
            "nov.",
            "des.",
            "",
        };
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final Object[][] data = new Object[][] {
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "calendarname.islamic-civil", "islamsk sivil kalender" },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "standalone.DayAbbreviations",
                new String[] {
                    "s\u00f8n",
                    "m\u00e5n",
                    "tys",
                    "ons",
                    "tor",
                    "fre",
                    "lau",
                }
            },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} 'kl'. {0}",
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
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "field.month", "m\u00e5nad" },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DayPeriodRules", "midnight:00:00;night1:00:00-06:00;morning2:10:00-12:00;afternoon1:12:00-18:00;morning1:06:00-10:00;evening1:18:00-24:00" },
            { "islamic-civil.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "{one:0' 'million other:0' 'millionar}",
                    "{one:00' 'million other:00' 'millionar}",
                    "{one:000' 'million other:000' 'millionar}",
                    "{one:0' 'milliard other:0' 'milliardar}",
                    "{one:00' 'milliard other:00' 'milliardar}",
                    "{one:000' 'milliard other:000' 'milliardar}",
                    "{one:0' 'billion other:0' 'billionar}",
                    "{one:00' 'billion other:00' 'billionar}",
                    "{one:000' 'billion other:000' 'billionar}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "field.weekday", "vekedag" },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "field.week", "veke" },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "timezone.regionFormat.daylight", "sommartid \u2013 {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE d. MMMM y",
                    "d. MMMM y",
                    "d. MMM y",
                    "dd.MM.y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "PluralRules", "one:n = 1" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
        };
        return data;
    }
}
