import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @org.junit.jupiter.api.Test
    void push() {
        MyStack testCase1 = new MyStack();
        assertTrue(testCase1.empty());

        testCase1.push(1);
        testCase1.push(2);

        assertTrue(!testCase1.empty());
        assertTrue(testCase1.size() == 2);

        testCase1.push(3);
        testCase1.push(4);
        testCase1.push(5);

        assertTrue(testCase1.size() == 5);
    }

    @org.junit.jupiter.api.Test
    void pop() {
        MyStack testCase2 = new MyStack();
        assertTrue(testCase2.empty());

        testCase2.push(6);
        testCase2.push(7);

        assertTrue(!testCase2.empty());
        assertTrue(testCase2.size() == 2);

        int expected1 = 7;
        int actual1 = testCase2.pop();
        assertTrue(expected1 == actual1);
        assertTrue(testCase2.size() == 1);

        int expected2 = 6;
        int actual2 = testCase2.pop();
        assertTrue(expected2 == actual2);
        assertTrue(testCase2.empty());

        testCase2.push(8);
        testCase2.push(9);
        testCase2.push(10);

        assertTrue(testCase2.size() == 3);

        int expected3 = 10;
        int actual3 = testCase2.pop();
        assertTrue(expected3 == actual3);
        assertTrue(testCase2.size() == 2);

        int expected4 = 9;
        int actual4 = testCase2.pop();
        assertTrue(expected4 == actual4);
        assertTrue(testCase2.size() == 1);

        int expected5 = 8;
        int actual5 = testCase2.pop();
        assertTrue(expected5 == actual5);
        assertTrue(testCase2.size() == 0);
        assertTrue(testCase2.empty());
    }

    @org.junit.jupiter.api.Test
    void top() {
        MyStack testCase3 = new MyStack();
        assertTrue(testCase3.empty());
        assertTrue(testCase3.top() == -1);

        testCase3.push(11);
        testCase3.push(12);
        int expected1 = 12;
        int actual1 = testCase3.top();

        assertEquals(expected1, actual1);

        testCase3.push(13);
        testCase3.push(14);
        testCase3.push(15);

        int expected2 = 15;
        int actual2 = testCase3.top();
        assertEquals(expected2, actual2);

        testCase3.pop();
        int expected3 = 14;
        int actual3 = testCase3.top();
        assertEquals(expected3, actual3);

        testCase3.pop();
        int expected4 = 13;
        int actual4 = testCase3.top();
        assertEquals(expected4, actual4);

        testCase3.pop();
        int expected5 = 12;
        int actual5 = testCase3.top();
        assertEquals(expected5, actual5);

        testCase3.pop();
        int expected6 = 11;
        int actual6 = testCase3.top();
        assertEquals(expected6, actual6);

        testCase3.pop();
        int expected7 = -1;
        int actual7 = testCase3.top();
        assertEquals(expected7, actual7);
        assertEquals(true, testCase3.empty());
    }

    @org.junit.jupiter.api.Test
    void empty() {
        MyStack testCase4 = new MyStack();
        assertTrue(testCase4.empty());

        testCase4.push(16);
        assertFalse(testCase4.empty());

        testCase4.push(17);
        testCase4.push(18);
        assertTrue(!testCase4.empty());
    }

    @org.junit.jupiter.api.Test
    void size() {
        MyStack testCase5 = new MyStack();
        assertTrue(testCase5.size() == 0);

        testCase5.push(21);
        testCase5.push(22);
        testCase5.push(23);
        assertTrue(testCase5.size() == 3);
    }
}