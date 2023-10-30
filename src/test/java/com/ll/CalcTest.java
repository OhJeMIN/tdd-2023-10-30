package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")
    void t1(){
        int rs = Calc.run("10 + 20");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2(){
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 = 0")
    void t3(){
        int rs = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t4(){
        int rs = Calc.run("10 + 20");
        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10 * 10 = 100")
    void t5(){
        int rs = Calc.run("10 * 10");
        assertThat(rs).isEqualTo(100);
    }

    @Test
    @DisplayName("10 / 10 = 1")
    void t6(){
        int rs = Calc.run("10 / 10");
        assertThat(rs).isEqualTo(1);
    }

/*    @Test
    @DisplayName("(3 - 1) = 2")
    void t7(){
        int rs = Calc.run("(3 - 1) = 2");
        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("(3 + 1) = 4")
    void t8(){
        int rs = Calc.run("(3 + 1) = 4");
        assertThat(rs).isEqualTo(4);
    }*/
}
