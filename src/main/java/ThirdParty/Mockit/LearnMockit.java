package ThirdParty.Mockit;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

/**
 * Project: LearnJava
 * Package: ThirdParty.Mockit
 * Author:  Novemser
 * 2017/7/23
 */
@SuppressWarnings("all")
public class LearnMockit {
    public static void main(String[] args) {
        // mock creation
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        when(mockedList.get(0)).thenReturn("first");

        // the following prints "first"
        System.out.println(mockedList.get(0));

        // the following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
    }
}
