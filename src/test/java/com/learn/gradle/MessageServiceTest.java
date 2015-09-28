package com.learn.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author 作者： zhanghaiwei
 * @version 1.0
 * @date 创建时间：2015/9/28 16:14
 * @since jdk1.6.0_27
 */
public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", messageService.getMessage());
    }
}
