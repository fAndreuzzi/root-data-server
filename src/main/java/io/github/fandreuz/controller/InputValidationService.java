package io.github.fandreuz.controller;

import jakarta.validation.ConstraintValidator;

/**
 * Interface for services providing input validation.
 *
 * @author fandreuz
 */
public interface InputValidationService extends ConstraintValidator<ValidDatasetLocator, DatasetLocator> {

   // Marker
}
