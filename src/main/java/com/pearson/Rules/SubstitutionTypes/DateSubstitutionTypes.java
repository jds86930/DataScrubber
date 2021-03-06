package com.pearson.Rules.SubstitutionTypes;

/**
 * @author Ruslan Kiselev
 *         Date: 6/14/13
 *         Time: 10:25 AM
 *         Project Name: DataScrubber
 */
public enum DateSubstitutionTypes {
    RANDOM_DATE_WITHING_RANGE, SET_TO_NULL, SET_TO_VALUE;

    public String toString(){
       if(this == RANDOM_DATE_WITHING_RANGE) return "Random Date Within Range";
       else if (this == SET_TO_VALUE) return "Set To Value";
       else return "Set To Null";
    }
}
