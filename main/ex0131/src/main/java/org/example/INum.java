package org.example;

// cloneble -> clone
// comparable -> compareTo

import lombok.ToString;

@ToString
public class INum implements Comparable{
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 101023;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum)obj).num;
    }

    // Arrays.sort 호출하면 기본형(int, double) 타입 정렬
    // 객체형타입(Inum, Person)을 정렬할려고
    // Comparable 상속받아서 ompareTo 재정의



    @Override
    public int compareTo(Object o) {
        return ((INum) o).num - this.num ;
    }
}
