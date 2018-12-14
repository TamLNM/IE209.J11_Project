package com.example.lenguyenminhtam.ie209j1_project;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;

import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
public class DatabaseHocSinhHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "quanlyhocsinh";
    public static final String hocsinh= "hocsinh";
    public static final String MSHS= "MSHS";
    public static final String HoTenHS= "HoTenHS";
    public static final String GioiTinh= "GioiTinh";
    public static final String NgaySinh= "NgaySinh";
    public static final String DiaChi= "DiaChi";
    public static final String Email= "Email";
    public static final String Malop= "Malop";

    public static final String lop= "lop";

    public static final String TenLop= "TenLop";
    public static final String SiSo= "SiSo";
    public static final String NamHoc= "NamHoc";



    public DatabaseHocSinhHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override

    public void onCreate (SQLiteDatabase db){
        String create_table_hocsinh = String.format("CREATE TABLE IF NOT EXISTS hocsinh ('MSHS' bigint(20) NOT NULL, " +
                "'HoTenHS' varchar(100)NOT NULL, 'GioiTinh' varchar(5) NOT NULL, 'NgaySinh' date NOT NULL," +
                "'DiaChi' varchar(100) NOT NULL, 'Email' varchar(100) NOT NULL, 'MaLop' bigint(20) NOT NULL," +
                "PRIMARY KEY ('MSHS')),KEY 'MaLop' ('MaLop');");
        String create_table_lop = String.format("CREATE TABLE IF NOT EXISTS lop ('MaLop' bigint(20) NOT NULL, \" +\n" +
                "                \"'TenLop' varchar(20)NOT NULL, 'SiSo' int(11) NOT NULL, 'NamHoc' varchar(15) NOT NULL,\" +\n" +
                "                 \"PRIMARY KEY ('MaLop'));");
        String insert_hocsinh=String.format("INSERT INTO `hocsinh` (`MSHS`, `HoTenHS`, `GioiTinh`, `NgaySinh`, `DiaChi`, `Email`, `MaLop`) VALUES\n" +
                "(1610101, 'Hoàng Bảo Anh', 'Nữ', '1996-12-04', '123/3 đường Lê Lợi, phường Bến Nghé, Quận 1, thành phố Hồ Chí Minh', '1610101@gmail.com', 16101),\n" +
                "(1610102, 'Nguyễn Bảo Anh', 'Nữ', '1996-06-06', '123/5B đường Lê Lợi, phường 6, thành phố Tuy Hòa, tỉnh Phú Yên', '1610102@gmail.com', 16101),\n" +
                "(1610103, 'Trần Ngọc Bảo', 'Nữ', '1996-08-12', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610103@gmail.com', 16101),\n" +
                "(1610104, 'Nguyễn Thanh Bình', 'Nam', '1996-09-23', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610104@gmail.com', 16101),\n" +
                "(1610105, 'Nguyễn Ngọc Hải', 'Nam', '1996-03-12', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610105@gmail.com', 16101),\n" +
                "(1610106, 'Nguyện Đình Hùng', 'Nam', '1996-05-22', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610106@gmail.com', 16101),\n" +
                "(1610107, 'Lưu Bảo Ly', 'Nữ', '1996-07-12', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610107@gmail.com', 16101),\n" +
                "(1610108, 'Nguyễn Thanh Nga', 'Nữ', '1996-06-20', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610108@gmail.com', 16101),\n" +
                "(1610109, 'Nguyễn Bảo Ngọc', 'Nữ', '1996-06-16', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610109@gmail.com', 16101),\n" +
                "(1610110, 'Nguyễn Thanh Sang', 'Nam', '1996-06-29', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610110@gmail.com', 16101),\n" +
                "(1610111, 'Nguyễn Đình Tâm', 'Nam', '1996-06-10', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610111@gmail.com', 16101),\n" +
                "(1610112, 'Hoàng Anh Thư', 'Nữ', '1996-06-06', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610112@gmail.com', 16101),\n" +
                "(1610113, 'Phạm Thanh Thùy', 'Nữ', '1996-06-20', 'Đội 3 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610113@gmail.com', 16101),\n" +
                "(1610114, 'Trần Đình Tùng', 'Nam', '1996-06-14', 'Đội 4 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610114@gmail.com', 16101),\n" +
                "(1610115, 'Phạm Kỳ Vĩ', 'Nam', '1996-06-18', 'Đội 4 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610115@gmail.com', 16101),\n" +
                "(1610201, 'Hoàng Bảo Anh', 'Nam', '1996-05-12', 'Đội 4 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610201@gmail.com', 16102),\n" +
                "(1610202, 'Nguyễn Bảo Anh', 'Nam', '1996-04-23', 'Đội 4 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên', '1610202@gmail.com', 16102),\n" +
                "(1610203, 'Trần Ngọc Bảo', 'Nữ', '1996-03-25', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610203@gmail.com', 16102),\n" +
                "(1610204, 'Nguyễn Đình Hùng', 'Nam', '1996-07-12', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610204@gmail.com', 16102),\n" +
                "(1610205, 'Lưu Bảo Ly', 'Nữ', '1996-09-23', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610205@gmail.com', 16102),\n" +
                "(1610206, 'Trần Anh Minh', 'Nữ', '1996-05-03', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610206@gmail.com', 16102),\n" +
                "(1610207, 'Trần Ngọc Minh', 'Nữ', '1996-04-19', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610207@gmail.com', 16102),\n" +
                "(1610208, 'Trần Thanh Minh', 'Nam', '1996-03-25', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610208@gmail.com', 16102),\n" +
                "(1610209, 'Nguyễn Thanh Sang', 'Nam', '1996-07-13', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610209@gmail.com', 16102),\n" +
                "(1610210, 'Hoàng Anh Thư', 'Nữ', '1996-09-19', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610210@gmail.com', 16102),\n" +
                "(1610211, 'Phạm Thanh Thùy', 'Nữ', '1996-05-26', 'Đội 5 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610211@gmail.com', 16102),\n" +
                "(1610212, 'Nguyễn Minh Trí', 'Nam', '1996-04-03', 'Đội 6 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610212@gmail.com', 16102),\n" +
                "(1610213, 'Phạm Minh Trí', 'Nam', '1996-03-15', 'Đội 6 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610213@gmail.com', 16102),\n" +
                "(1610214, 'Trần Đình Tùng', 'Nam', '1996-07-20', 'Đội 6 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610214@gmail.com', 16102),\n" +
                "(1610215, 'Phạm Kỳ Vĩ', 'Nam', '1996-04-03', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1610315@gmail.com', 16102),\n" +
                "(1611101, 'Lưu Bảo Ly', 'Nữ', '1995-03-15', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611101@gmail.com', 16111),\n" +
                "(1611102, 'Hoàng Anh Thư', 'Nữ', '1995-07-20', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611102@gmail.com', 16111),\n" +
                "(1611103, 'Nguyễn Bảo Anh', 'Nam', '1995-09-10', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611103@gmail.com', 16111),\n" +
                "(1611104, 'Nguyễn Thanh Bình', 'Nam', '1995-03-12', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611104@gmail.com', 16111),\n" +
                "(1611105, 'Nguyễn Ngọc Hải', 'Nam', '1995-05-22', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611105@gmail.com', 16111),\n" +
                "(1611106, 'Nguyện Đình Hùng', 'Nam', '1995-07-12', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611106@gmail.com', 16111),\n" +
                "(1611107, 'Nguyễn Đình Tâm', 'Nam', '1995-06-20', 'Đội 7 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611107@gmail.com', 16111),\n" +
                "(1611108, 'Nguyễn Bảo Ngọc', 'Nữ', '1995-06-16', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611108@gmail.com', 16111),\n" +
                "(1611109, 'Phạm Minh Minh', 'Nam', '1995-06-29', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611109@gmail.com', 16111),\n" +
                "(1611110, 'Hoàng Kim Thư', 'Nữ', '1995-06-10', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611110@gmail.com', 16111),\n" +
                "(1611111, 'Hoàng Bảo Anh', 'Nữ', '1995-06-06', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611111@gmail.com', 16111),\n" +
                "(1611112, 'Nguyễn Minh Anh', 'Nam', '1995-06-20', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611112@gmail.com', 16111),\n" +
                "(1611113, 'Nguyễn Thị Thủy', 'Nữ', '1995-06-14', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611113@gmail.com', 16111),\n" +
                "(1611114, 'Thái Ngọc Bảo', 'Nữ', '1995-07-20', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611114@gmail.com', 16111),\n" +
                "(1611115, 'Trần Anh Thi', 'Nam', '1995-09-10', 'Đội 1 thôn Phú Lợi, xã Hòa An, huyện Phú Hòa, tỉnh Phú Yên.', '1611115@gmail.com', 16111),\n" +
                "(1611201, 'Lê Ngọc Trâm', 'Nữ', '1995-01-12', '550, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611116@gmail.com', 16112),\n" +
                "(1611202, 'Nguyễn Hồng Ngọc', 'Nữ', '1995-01-13', '120, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611117@gmail.com', 16112),\n" +
                "(1611203, 'Lê Trần Ngọc Hoàng', 'Nữ', '1995-06-14', '292, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611118@gmail.com', 16112),\n" +
                "(1611204, 'Lê Thị Hân', 'Nữ', '1995-03-15', '555, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611119@gmail.com', 16112),\n" +
                "(1611205, 'Trần Thị Mỹ Hân', 'Nữ', '1995-02-16', '335, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611120@gmail.com', 16112),\n" +
                "(1611206, 'Trần Thị Châu', 'Nữ', '1995-01-17', '125, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611121@gmail.com', 16112),\n" +
                "(1611207, 'Trần Duyên Ánh Tuyết', 'Nữ', '1995-08-18', '454, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611122@gmail.com', 16112),\n" +
                "(1611208, 'Nguyễn Thị Hoàng Mỹ', 'Nữ', '1995-01-19', '551, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611123@gmail.com', 16112),\n" +
                "(1611209, 'Nguyễn Mạnh Hùng', 'Nam', '1995-08-20', '201, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611124@gmail.com', 16112),\n" +
                "(1611210, 'Lê Công Minh', 'Nam', '1995-07-21', '103, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611125@gmail.com', 16112),\n" +
                "(1611211, 'Nguyễn Dương Hải', 'Nam', '1995-06-22', '559, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611126@gmail.com', 16112),\n" +
                "(1611212, 'Nguyễn Trần Trung Hậu', 'Nam', '1995-10-23', '569, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611127@gmail.com', 16112),\n" +
                "(1611213, 'Lê Bảo Trung', 'Nam', '1995-01-24', '378, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611128@gmail.com', 16112),\n" +
                "(1611214, 'Trần Thị Ngọc Hạnh', 'Nữ', '1995-04-25', '1001B, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1611129@gmail.com', 16112),\n" +
                "(1611215, 'Trần Hoàng Nam', 'Nam', '1995-11-12', '900A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1611130@gmail.com', 16112),\n" +
                "(1612101, 'Lê Ngọc Hoàng', 'Nữ', '1994-01-12', '550, Tỉnh lộ 43, quận Thủ Đức, thành phố Hồ Chí Minh', '1511101@gmail.com', 16121),\n" +
                "(1612102, 'Nguyễn Ngọc Kim', 'Nữ', '1994-01-13', '900A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511102@gmail.com', 16121),\n" +
                "(1612103, 'Lê Nguyễn Ngọc Hạnh', 'Nữ', '1994-01-14', '901A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511103@gmail.com', 16121),\n" +
                "(1612104, 'Lê Thị Dung', 'Nữ', '1994-01-15', '902A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511104@gmail.com', 16121),\n" +
                "(1612105, 'Trần Thị Mỹ Hân', 'Nữ', '1994-01-16', '903A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511105@gmail.com', 16121),\n" +
                "(1612106, 'Trần Thị Châu', 'Nữ', '1994-01-17', '904A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511106@gmail.com', 16121),\n" +
                "(1612107, 'Trần Duyên Ánh', 'Nữ', '1994-01-18', '905A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511107@gmail.com', 16121),\n" +
                "(1612108, 'Nguyễn Thị Hoàng Mỹ', 'Nữ', '1994-01-19', '906A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511108@gmail.com', 16121),\n" +
                "(1612109, 'Nguyễn Mạnh Hoàn', 'Nam', '1994-01-20', '907A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511109@gmail.com', 16121),\n" +
                "(1612110, 'Nguyễn Công Minh', 'Nam', '1994-01-21', '908A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511110@gmail.com', 16121),\n" +
                "(1612111, 'Nguyễn Dương Sỹ', 'Nam', '1994-01-22', '908A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511111@gmail.com', 16121),\n" +
                "(1612112, 'Nguyễn Trần Trung Quân', 'Nam', '1994-01-23', '909A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511112@gmail.com', 16121),\n" +
                "(1612113, 'Lê Bảo Triều', 'Nam', '1994-01-24', '910A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511113@gmail.com', 16121),\n" +
                "(1612114, 'Lê Thị Ngọc Châu', 'Nữ', '1994-01-25', '911A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511114@gmail.com', 16121),\n" +
                "(1612115, 'Lê Trần Thái Minh', 'Nam', '1994-09-22', '912A, đường quốc lộ 1A, p. Bình Hưng Hòa, quận Bình Tân, thành phố Hồ Chí Minh', '1511115@gmail.com', 16121),\n" +
                "(1612201, 'Trần Ngọc Mỹ Dung', 'Nữ', '1994-04-20', '48 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511116@gmail.com', 16122),\n" +
                "(1612202, 'Nguyễn Ngọc Ánh', 'Nữ', '1994-01-13', '49 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511117@gmail.com', 16122),\n" +
                "(1612203, 'Lê Nguyễn Mỹ Hạnh', 'Nữ', '1994-10-24', '50 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511118@gmail.com', 16122),\n" +
                "(1612204, 'Lê Kim Dung', 'Nữ', '1994-11-15', '51 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511119@gmail.com', 16122),\n" +
                "(1612205, 'Trần Thị Hồng ', 'Nữ', '1994-11-06', '52 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511120@gmail.com', 16122),\n" +
                "(1612206, 'Trần Thị Ngọc Ánh', 'Nữ', '1994-01-17', '53 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511121@gmail.com', 16122),\n" +
                "(1612207, 'Trần Cao Hồng Ngọc', 'Nữ', '1994-01-18', '54 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511122@gmail.com', 16122),\n" +
                "(1612208, 'Nguyễn Thị Ngọc Tuyết', 'Nữ', '1994-01-19', '55 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511123@gmail.com', 16122),\n" +
                "(1612209, 'Nguyễn Trần Hải Triều', 'Nam', '1994-01-20', '56 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511124@gmail.com', 16122),\n" +
                "(1612210, 'Nguyễn Hải Minh', 'Nam', '1994-01-21', '57 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511125@gmail.com', 16122),\n" +
                "(1612211, 'Nguyễn Văn Sỹ', 'Nam', '1994-09-19', '58 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511126@gmail.com', 16122),\n" +
                "(1612212, 'Nguyễn Trần Minh Tú', 'Nam', '1994-11-19', '59 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511127@gmail.com', 16122),\n" +
                "(1612213, 'Lê Hoàng Thái', 'Nam', '1994-12-02', '60 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511128@gmail.com', 16122),\n" +
                "(1612214, 'Lê Thị Trang', 'Nữ', '1994-10-10', '61 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511129@gmail.com', 16122),\n" +
                "(1612215, 'Lê Trọng Hoàng', 'Nam', '1994-12-08', '62 Đặng Văn Bi, Bình Thọ, Thủ Đức, Hồ Chí Minh', '1511130@gmail.com', 16122);");
        String insert_lop=String.format("INSERT INTO `lop` (`MaLop`, `TenLop`, `SiSo`, `NamHoc`) VALUES\n" +
            "(16101, '10A', 3, '2016 - 2017'),\n" +
            "(16102, '10B', 3, '2016 - 2017'),\n" +
            "(16111, '11A', 3, '2016 - 2017'),\n" +
            "(16112, '11B', 3, '2016 - 2017'),\n" +
            "(16121, '12A', 3, '2016 - 2017'),\n" +
            "(16122, '12B', 3, '2016 - 2017');");

        db.execSQL(create_table_hocsinh);
        db.execSQL(create_table_lop);
        db.execSQL(insert_hocsinh);
        db.execSQL(insert_lop);


}

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
String drop_hocsinh=String.format("DROP TABLE IF EXISTS `hocsinh`;");
        String drop_lop=String.format("DROP TABLE IF EXISTS `lop`;");
        db.execSQL(drop_hocsinh);
        db.execSQL(drop_lop);
    }
    public boolean insertHocSinh (String mshs, String hotenhs, String gioitinh, String ngaysinh, String diachi, String email, String malop){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(MSHS,mshs);
        contentValues.put(HoTenHS,hotenhs);
        contentValues.put(GioiTinh,gioitinh);
        contentValues.put(NgaySinh,ngaysinh);
        contentValues.put(DiaChi,diachi);
        contentValues.put(Email,email);
        contentValues.put(Malop,malop);
        long result =  db.insert(hocsinh,null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertLop (String malop, String tenlop, String siso, String namhoc){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(Malop,malop);
        contentValues.put(SiSo,siso);
        contentValues.put(NamHoc,namhoc);

        long result =  db.insert(lop,null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
