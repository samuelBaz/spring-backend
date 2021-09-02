package com.sales.market.util;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CategoryUtilTest {

    @Test
    public void givenCategoryDTOWithCodeLengthLessThanMinimunSizeWhenCategoryDTO_validateThenCheckedErrorShouldBeCatchAndYouShouldRecoverWithTrailingXCharacters() {
        CategoryUtil categoryUtil = new CategoryUtil();
        categoryUtil.setCode("ABC");
        try {
            categoryUtil.validate();
        } catch (CheckedException e) {
            categoryUtil.setCode("XXXABC");
            try {
                categoryUtil.validate();
                categoryUtil.setSanitized(true);
            } catch (CheckedException checkedException) {
                checkedException.printStackTrace();
            }
        }
        assertTrue(categoryUtil.getSanitized());
        assertEquals(categoryUtil.getCode(),"XXXABC");
    }

    @Test
    public void givenCategoryDTOWithCodeLengthLessThanMinimunSizeWhenCategoryDTO_validateUncheckedThenUncheckedErrorShouldBeThrown() {
        CategoryUtil categoryUtil = new CategoryUtil();
        categoryUtil.setCode("ABC");
        categoryUtil.validateUnchecked();
        assertEquals(categoryUtil.getCode(),"ABC");
        assertFalse(categoryUtil.getSanitized());
    }
}