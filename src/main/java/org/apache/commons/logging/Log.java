/*
 * JBoss, Home of Professional Open Source.
 *
 * Copyright 2016 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.logging;

/**
 * A simple org.apache.commons.logging interface abstracting org.apache.commons.logging APIs.  In order to be
 * instantiated successfully by {@link LogFactory}, classes that implement
 * this interface must have a constructor that takes a single String
 * parameter representing the "name" of this Log.
 * <p>
 * The six org.apache.commons.logging levels used by <code>Log</code> are (in order):
 * <ol>
 * <li>trace (the least serious)</li>
 * <li>debug</li>
 * <li>info</li>
 * <li>warn</li>
 * <li>error</li>
 * <li>fatal (the most serious)</li>
 * </ol>
 * The mapping of these log levels to the concepts used by the underlying
 * org.apache.commons.logging system is implementation dependent.
 * The implementation should ensure, though, that this ordering behaves
 * as expected.
 * <p>
 * Performance is often a org.apache.commons.logging concern.
 * By examining the appropriate property,
 * a component can avoid expensive operations (producing information
 * to be logged).
 * <p>
 * For example,
 * <pre>
 *    if (log.isDebugEnabled()) {
 *        ... do something expensive ...
 *        log.debug(theResult);
 *    }
 * </pre>
 * <p>
 * Configuration of the underlying org.apache.commons.logging system will generally be done
 * external to the Logging APIs, through whatever mechanism is supported by
 * that system.
 *
 * @version $Id: Log.java 1606045 2014-06-27 12:11:56Z tn $
 */
public interface Log {

    /**
     * Logs a message with debug log level.
     *
     * @param message log this message
     */
    void debug(Object message);

    /**
     * Logs an error with debug log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void debug(Object message, Throwable t);

    /**
     * Logs a message with error log level.
     *
     * @param message log this message
     */
    void error(Object message);

    /**
     * Logs an error with error log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void error(Object message, Throwable t);

    /**
     * Logs a message with fatal log level.
     *
     * @param message log this message
     */
    void fatal(Object message);

    /**
     * Logs an error with fatal log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void fatal(Object message, Throwable t);

    /**
     * Logs a message with info log level.
     *
     * @param message log this message
     */
    void info(Object message);

    /**
     * Logs an error with info log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void info(Object message, Throwable t);

    /**
     * Is debug org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than debug.
     *
     * @return true if debug is enabled in the underlying logger.
     */
    boolean isDebugEnabled();

    /**
     * Is error org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than error.
     *
     * @return true if error is enabled in the underlying logger.
     */
    boolean isErrorEnabled();

    /**
     * Is fatal org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than fatal.
     *
     * @return true if fatal is enabled in the underlying logger.
     */
    boolean isFatalEnabled();

    /**
     * Is info org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than info.
     *
     * @return true if info is enabled in the underlying logger.
     */
    boolean isInfoEnabled();

    /**
     * Is trace org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than trace.
     *
     * @return true if trace is enabled in the underlying logger.
     */
    boolean isTraceEnabled();

    /**
     * Is warn org.apache.commons.logging currently enabled?
     * <p>
     * Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than warn.
     *
     * @return true if warn is enabled in the underlying logger.
     */
    boolean isWarnEnabled();

    /**
     * Logs a message with trace log level.
     *
     * @param message log this message
     */
    void trace(Object message);

    /**
     * Logs an error with trace log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void trace(Object message, Throwable t);

    /**
     * Logs a message with warn log level.
     *
     * @param message log this message
     */
    void warn(Object message);

    /**
     * Logs an error with warn log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    void warn(Object message, Throwable t);
}
