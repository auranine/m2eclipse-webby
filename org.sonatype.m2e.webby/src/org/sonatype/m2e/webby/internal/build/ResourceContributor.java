/*******************************************************************************
 * Copyright (c) 2011 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.sonatype.m2e.webby.internal.build;

import org.eclipse.core.runtime.IProgressMonitor;


/**
 */
public abstract class ResourceContributor {

  protected final int ordinal;

  protected ResourceContributor(int ordinal) {
    this.ordinal = ordinal;
  }

  public abstract void contribute(WarAssembler assembler, IProgressMonitor monitor);

}
