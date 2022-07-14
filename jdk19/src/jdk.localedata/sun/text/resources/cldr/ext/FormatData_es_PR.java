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

public class FormatData_es_PR extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y G",
            "d 'de' MMMM 'de' y G",
            "MM/dd/y G",
            "MM/dd/yy GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y GGGG",
            "d 'de' MMMM 'de' y GGGG",
            "MM/dd/y GGGG",
            "MM/dd/yy G",
        };
        final String metaValue_generic_DateFormatItem_yMEd = "E MM/dd/y";
        final String metaValue_generic_DateFormatItem_Md = "MM/dd";
        final String metaValue_generic_DateFormatItem_MEd = "E, MM/dd";
        final String metaValue_generic_DateFormatItem_yMd = "MM/dd/y";
        final String metaValue_generic_DateFormatItem_yM = "MM/y";
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
            "",
            "",
            "MM/dd/y G",
            "MM/dd/yy GGGGG",
        };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
            "",
            "",
            "MM/dd/y GGGG",
            "MM/dd/yy G",
        };
        final Object[][] data = new Object[][] {
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "generic.DateFormatItem.yyyyM", "MM/y G" },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yyyyMd", "MM/dd/y G" },
            { "generic.DateFormatItem.yyyyMEd", "E MM/dd/y G" },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "MM/dd/y",
                    "MM/dd/yy",
                }
            },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
        };
        return data;
    }
}
