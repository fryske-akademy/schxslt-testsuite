/*
 * Copyright (C) 2020 by David Maus <dmaus@dmaus.name>
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package name.dmaus.schxslt.testsuite;

import java.util.Map;
import java.util.ArrayList;

/**
 * Build commandline for xsltproc implementation.
 *
 */
final class XsltprocCommandlineBuilder extends CommandlineBuilder
{
    final private static String[] isAvailableCommand = { "xsltproc", "--version" };

    String[] build ()
    {
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("xsltproc");
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                    commands.add("-stringparam");
                    commands.add(entry.getKey());
                    commands.add(entry.getValue());
                }
            }
        }
        commands.add("-o");
        commands.add(target.toAbsolutePath().toString());
        commands.add(stylesheet.toAbsolutePath().toString());
        commands.add(document.toAbsolutePath().toString());
        return commands.toArray(new String[0]);
    }

    public String[] buildIsAvailableCommand ()
    {
        return isAvailableCommand;
    }
}
