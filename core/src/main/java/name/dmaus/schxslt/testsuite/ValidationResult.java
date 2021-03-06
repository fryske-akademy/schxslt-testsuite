/*
 * Copyright (C) 2019,2020 by David Maus <dmaus@dmaus.name>
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

/**
 * Represents the result of executing a testcase.
 *
 */
public final class ValidationResult
{
    private final Testcase testcase;
    private final ValidationStatus status;
    private final String errorMessage;
    private final Object report;

    ValidationResult (final Testcase testcase, final ValidationStatus status)
    {
        this(testcase, status, null, null);
    }

    ValidationResult (final Testcase testcase, final ValidationStatus status, final Object report, final String errorMessage)
    {
        this.testcase = testcase;
        this.status = status;
        this.report = report;
        this.errorMessage = errorMessage;
    }

    public Testcase getTestcase ()
    {
        return testcase;
    }

    public ValidationStatus getStatus ()
    {
        return status;
    }

    public String getErrorMessage ()
    {
        return errorMessage;
    }

    public Object getReport ()
    {
        return report;
    }
}
