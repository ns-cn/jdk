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

public class FormatData_mgo extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "Aneg 1",
            "Aneg 2",
            "Aneg 3",
            "Aneg 4",
            "Aneg 5",
            "Aneg 6",
            "Aneg 7",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "A1",
            "A2",
            "A3",
            "A4",
            "A5",
            "A6",
            "A7",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
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
            "EEEE, G y MMMM dd",
            "G y MMMM d",
            "G y MMM d",
            "GGGGG y-MM-dd",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, GGGG y MMMM dd",
            "GGGG y MMMM d",
            "GGGG y MMM d",
            "G y-MM-dd",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String[] metaValue_MonthNames = new String[] {
            "im\u0259g mbegtug",
            "imeg \u00e0b\u00f9b\u00ec",
            "imeg mb\u0259\u014bchubi",
            "im\u0259g ngw\u0259\u0300t",
            "im\u0259g fog",
            "im\u0259g ichiib\u0254d",
            "im\u0259g \u00e0d\u00f9mb\u0259\u0300\u014b",
            "im\u0259g ichika",
            "im\u0259g kud",
            "im\u0259g t\u00e8si\u02bce",
            "im\u0259g z\u00f2",
            "im\u0259g krizmed",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "mbegtug",
            "imeg \u00e0b\u00f9b\u00ec",
            "imeg mb\u0259\u014bchubi",
            "im\u0259g ngw\u0259\u0300t",
            "im\u0259g fog",
            "im\u0259g ichiib\u0254d",
            "im\u0259g \u00e0d\u00f9mb\u0259\u0300\u014b",
            "im\u0259g ichika",
            "im\u0259g kud",
            "im\u0259g t\u00e8si\u02bce",
            "im\u0259g z\u00f2",
            "im\u0259g krizmed",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "M1",
            "A2",
            "M3",
            "N4",
            "F5",
            "I6",
            "A7",
            "I8",
            "K9",
            "10",
            "11",
            "12",
            "",
        };
        final String[] metaValue_long_Eras = new String[] {
            "BCE",
            "CE",
        };
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_calendarname_gregorian = "ng\u00e0b m\u0259\u0300kala";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "fitu\u02bc" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DayAbbreviations", metaValue_generic_DayNames },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.Eras", metaValue_long_Eras },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "field.weekday", "an\u0259g agu nkap" },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "buddhist.MonthNames", metaValue_MonthNames },
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
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "DayNames", metaValue_generic_DayNames },
            { "field.month", "im\u0259g" },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "nkap" },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "DatePatterns",
                new String[] {
                    "EEEE, y MMMM dd",
                    "y MMMM d",
                    "y MMM d",
                    "y-MM-dd",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "PluralRules", "one:n = 1" },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
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
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
