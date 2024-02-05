package org.example.item;


import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class Item {

    private long item_id;//자동 증가
    private String reg_time;//현재시간
    private String update_time;//수정시간
    private String created_by;//로그인
    private String modified_by;//로그인시간


    private String item_detail;
    private String item_nm;
    private String item_sell_status;
    private int price;
    private int stock_number;


}
