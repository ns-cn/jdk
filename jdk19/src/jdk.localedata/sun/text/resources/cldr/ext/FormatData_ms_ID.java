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

public class FormatData_ms_ID extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH.mm.ss zzzz",
            "HH.mm.ss z",
            "HH.mm.ss",
            "HH.mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, dd MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "dd/MM/yy GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, dd MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "dd/MM/yy G",
        };
        final String metaValue_generic_DateFormatItem_hm = "h.mm a";
        final String metaValue_generic_DateFormatItem_Ehm = "E h.mm a";
        final String metaValue_generic_DateFormatItem_hms = "h.mm.ss a";
        final String metaValue_generic_DateFormatItem_hmv = "h.mm a v";
        final String metaValue_generic_DateFormatItem_hmsv = "h.mm.ss. a v";
        final String metaValue_generic_DateFormatItem_Hm = "HH.mm";
        final String metaValue_generic_DateFormatItem_EHm = "E HH.mm";
        final String metaValue_generic_DateFormatItem_EBhm = "E h.mm B";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH.mm.ss v";
        final String metaValue_generic_DateFormatItem_Ehms = "E h.mm.ss a";
        final String metaValue_generic_DateFormatItem_Bhms = "h.mm.ss B";
        final String metaValue_generic_DateFormatItem_EHms = "E HH.mm.ss";
        final String metaValue_generic_DateFormatItem_EBhms = "E h.mm.ss B";
        final String metaValue_generic_DateFormatItem_Bhm = "h.mm B";
        final String metaValue_generic_DateFormatItem_Hms = "HH.mm.ss";
        final String metaValue_generic_DateFormatItem_Hmv = "HH.mm v";
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
            "EEEE, dd MMMM y G",
            "",
            "d MMM y G",
            "dd/MM/yy GGGGG",
        };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
            "EEEE, dd MMMM y GGGG",
            "",
            "d MMM y GGGG",
            "dd/MM/yy G",
        };
        final Object[][] data = new Object[][] {
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "roc.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "generic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
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
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-civil.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "timezone.hourFormat", "+HH.mm;-HH.mm" },
            { "buddhist.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "japanese.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, dd MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/yy",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "roc.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00",
                }
            },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
        };
        return data;
    }
}
