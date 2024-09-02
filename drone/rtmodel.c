/*
 *  rtmodel.c:
 *
 * Trial License - for use to evaluate programs for possible purchase as
 * an end-user only.
 *
 * Code generation for model "flightControlSystem".
 *
 * Model version              : 10.3
 * Simulink Coder version : 24.1 (R2024a) 19-Nov-2023
 * C source code generated on : Mon Aug 26 22:39:36 2024
 *
 * Target selection: grt.tlc
 * Note: GRT includes extra infrastructure and instrumentation for prototyping
 * Embedded hardware selection: ARM Compatible->ARM 9
 * Code generation objectives: Unspecified
 * Validation result: Not run
 */

#include "rtmodel.h"

/* Use this function only if you need to maintain compatibility with an existing static main program. */
void flightControlSystem_step(int_T tid)
{
  switch (tid) {
   case 0 :
    flightControlSystem_step0();
    break;

   case 1 :
    flightControlSystem_step1();
    break;

   default :
    /* do nothing */
    break;
  }
}
