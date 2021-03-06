/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.reporter.file.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * File reporter client configuration.
 *  
 * @author Loic DASSONVILLE (loic.dassonville at gmail.com)
 */
public class Config {

	/**
	 *  Reporter file name. 
	 */
	@Value("${reporters.file.fileName:#{systemProperties['gravitee.home']}/logs/access-yyyy_mm_dd.log}")
	private String filename;

	/**
	 * Whether existing files will be appended to or not.
	 */
	@Value("${reporters.file.append:true}")
	private boolean append;

	/**
	 * The number of days to retain files before deleting them. 0 to retain forever.
	 */
	@Value("${reporters.file.retainDays:0}")
	private int retainDays;

	/**
	 * The format for the date file substitution.
	 */
	@Value("${reporters.file.dateFormat:yyyy_MM_dd}")
	private String dateFormat;

	/**
	 * The format for the file extension of backup files.
	 */
	@Value("${reporters.file.backupFormat:HHmmssSSS}")
	private String backupFormat;

	public String getFilename() {
		return filename;
	}

	public boolean isAppend() {
		return append;
	}

	public int getRetainDays() {
		return retainDays;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public String getBackupFormat() {
		return backupFormat;
	}
}
