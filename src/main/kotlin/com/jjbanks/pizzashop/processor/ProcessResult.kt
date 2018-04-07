package com.jjbanks.pizzashop.processor

/**
 * Indication of complete or not complete for a processing step
 */
data class ProcessResult(val isComplete:Boolean, val processingMessage:String )