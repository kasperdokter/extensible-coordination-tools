/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ect.ea.costs.validation;


/**
 * A sample validator interface for {@link org.ect.ea.costs.CostsObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CostsObjectValidator {
	boolean validate();

	boolean validateType(Class value);
	boolean validateValue(Object value);
}
