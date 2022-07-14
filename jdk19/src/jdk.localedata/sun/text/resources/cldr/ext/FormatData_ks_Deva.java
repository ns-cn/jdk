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

public class FormatData_ks_Deva extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0906\u0925\u0935\u093e\u0930",
            "\u091a\u0902\u0926\u093f\u0930\u0935\u093e\u0930",
            "\u092c\u0941\u0935\u093e\u0930",
            "\u092c\u094b\u0926\u0935\u093e\u0930",
            "\u092c\u094d\u0930\u0947\u0938\u0935\u093e\u0930",
            "\u091c\u0941\u092e\u094d\u092e\u093e",
            "\u092c\u091f\u0935\u093e\u0930",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u0905",
            "\u091a",
            "\u092c",
            "\u092c",
            "\u092c",
            "\u091c",
            "\u092c",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1st \u0938\u0939 \u092e\u093e\u0939",
            "2nd \u0938\u0939 \u092e\u093e\u0939",
            "3rd \u0938\u0939 \u092e\u093e\u0939",
            "4th \u0938\u0939 \u092e\u093e\u0939",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "Q1",
            "Q2",
            "Q3",
            "Q4",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "a h:mm:ss zzzz",
            "a h:mm:ss z",
            "a h:mm:ss",
            "a h:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "G y MMMM d, EEEE",
            "G y MMMM d",
            "G y MMM d",
            "GGGGG y-MM-dd",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGG y MMMM d, EEEE",
            "GGGG y MMMM d",
            "GGGG y MMM d",
            "G y-MM-dd",
        };
        final String[] metaValue_MonthNames = new String[] {
            "\u091c\u0928\u0935\u0930\u0940",
            "\u092b\u093c\u0930\u0935\u0930\u0940",
            "\u092e\u093e\u0930\u094d\u091a",
            "\u0905\u092a\u094d\u0930\u0948\u0932",
            "\u092e\u0947",
            "\u091c\u0942\u0928",
            "\u091c\u0941\u0932\u093e\u0908",
            "\u0905\u0917\u0938\u094d\u0924",
            "\u0938\u0924\u0941\u0902\u092c\u0930",
            "\u0905\u0915\u0924\u0941\u092e\u094d\u092c\u0930",
            "\u0928\u0935\u0942\u092e\u092c\u0930",
            "\u0926\u0938\u0942\u092e\u092c\u0930",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u091c",
            "\u092b\u093c",
            "\u092e",
            "\u0905",
            "\u092e",
            "\u091c",
            "\u091c",
            "\u0905",
            "\u0938",
            "\u0913",
            "\u0928",
            "\u0926",
            "",
        };
        final String[] metaValue_long_Eras = new String[] {
            "BC",
            "AD",
        };
        final String metaValue_calendarname_gregorian = "\u0917\u094d\u0930\u093f\u0917\u094b\u0930\u093f\u092f\u0928 \u0915\u0948\u0932\u0902\u0921\u0930";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0935\u0930\u0940\u0939" },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateTimePatterns",
                new String[] {
                    "{0} \u092a\u0947\u0920 {1}",
                    "{0} \u092a\u0947\u0920 {1}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "field.zone", "\u0935\u0916 \u091c\u093c\u0942\u0928" },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "timezone.regionFormat.standard", "{0} \u0938\u094d\u091f\u0948\u0928\u094d\u0921\u0930\u094d\u0921 \u0935\u0916" },
            { "Eras", metaValue_long_Eras },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "long.Eras", metaValue_long_Eras },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "field.weekday", "\u0939\u092b\u093c\u0924\u0942\u0915 \u0926\u094b\u0939" },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{0} \u092a\u0947\u0920 {1}",
                    "{0} \u092a\u0947\u0920 {1}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "field.minute", "\u092e\u093f\u0928\u091f" },
            { "field.era", "\u0926\u094b\u0930" },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "field.dayperiod", "AM/PM" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "DayNames", metaValue_generic_DayNames },
            { "field.month", "\u092e\u093e\u0939" },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "field.second", "\u0938\u0947\u0915\u0902\u0921" },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "\u0939\u092b\u093c\u0924\u093f" },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", "{0} \u0921\u0947 \u0932\u093e\u0907\u091f \u0935\u0916" },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "field.hour", "\u0917\u0928\u091f\u093f" },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "{0} \u0935\u0916" },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
