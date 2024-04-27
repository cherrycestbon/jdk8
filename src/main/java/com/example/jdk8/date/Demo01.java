package com.example.jdk8.date;

import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * Java 8 中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间。当你仅需要表示日期时就用这个类。
         */
        // LocalDate today = LocalDate.now();
        // System.out.println("今天的日期:"+today);
        // String s = today.toString();
        // System.out.println("今天的日期s:"+today);
        //
        // int year = today.getYear();
        // int month = today.getMonthValue();
        // int day = today.getDayOfMonth();
        //
        // System.out.println("year:"+year);
        // System.out.println("month:"+String.format("%02d", month));
        // System.out.println("day:"+day);
        //
        // LocalDate date = LocalDate.of(2018,1,6);
        // System.out.println("自定义日期:"+date);
        //
        // LocalDate date1 = LocalDate.now();
        //
        // LocalDate date2 = LocalDate.of(2022,7,27);
        //
        // if(date1.equals(date2)){
        //     System.out.println("时间相等");
        // }else{
        //     System.out.println("时间不等");
        // }
        //
        // LocalDate date11 = LocalDate.now();
        // //出生日期
        // LocalDate date12 = LocalDate.of(2018,2,6);
        // //从出生日期获取生日
        // MonthDay birthday = MonthDay.of(date12.getMonth(),date12.getDayOfMonth());
        // //获取当前日期的年月
        // MonthDay currentMonthDay = MonthDay.from(date11);
        // //比较生日和当前的年月，这里也可以比较时间的前后
        // if(currentMonthDay.equals(birthday)){
        //     System.out.println("是你的生日");
        // }else{
        //     System.out.println("你的生日还没有到");
        // }
        //
        // // LocalTime time = LocalTime.now();
        // // System.out.println("获取当前的时间,不含有日期:"+time);
        //
        // LocalTime time = LocalTime.now();
        // System.out.println("现在的时间为:"+time);
        // LocalTime newTime = time.plusHours(3);
        // LocalTime plus = time.plus(1, ChronoUnit.MINUTES);
        // System.out.println("三个小时后的时间为:"+newTime);
        // System.out.println("一个小时后的时间为:"+plus);

        // LocalDate today = LocalDate.now();
        // System.out.println("今天的日期为:"+today);
        // LocalDate nextWeek = today.plus(1, ChronoUnit.);
        // System.out.println("一周后的日期为:"+nextWeek);

        // LocalDate today = LocalDate.now();
        //
        // LocalDate previousYear = today.minus(1, ChronoUnit.MONTHS);
        // System.out.println("一年前的日期 : " + previousYear);
        //
        // LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        // System.out.println("一年后的日期:"+nextYear);
        // 获取时间戳
        //long l = System.currentTimeMillis();//1658890722496
        //System.out.println(l);
        //当前时区下的日期时间信息
        //TimeZone aDefault = TimeZone.getDefault();//sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null]
        //System.out.println(aDefault);

        // LocalDate today = LocalDate.now();
        //
        // LocalDate tomorrow = LocalDate.of(2018,2,6);
        // if(tomorrow.isAfter(today)){
        //     System.out.println("之后的日期:"+tomorrow);
        // }
        //
        // LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        // if(yesterday.isBefore(today)){
        //     System.out.println("之前的日期:"+yesterday);
        // }

        // YearMonth currentYearMonth = YearMonth.now();
        // System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        // YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        // System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
        // //2019年2月有几天
        // System.out.println(creditCardExpiry.lengthOfMonth());
        //
        // LocalDate today = LocalDate.now();
        // LocalDate java8Release = LocalDate.of(2018, 12, 14);
        // Period periodToNextJavaRelease = Period.between(today, java8Release);
        // System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths() );

        // Clock clock = Clock.systemUTC();
        // System.out.println(clock.millis());
        // Instant timestamp = Instant.now();
        // System.out.println("What is value of this instant " + timestamp.toEpochMilli());

        // String dayAfterTommorrow = "20180205";
        // LocalDate formatted = LocalDate.parse(dayAfterTommorrow,
        //         DateTimeFormatter.BASIC_ISO_DATE);
        // System.out.println(dayAfterTommorrow+"  格式化后的日期为:  "+formatted);

        // LocalDateTime date = LocalDateTime.now();
        //
        // DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // //日期转字符串
        // String str = date.format(format1);
        //
        // System.out.println("日期转换为字符串:"+str);
        //
        // DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // //字符串转日期
        // LocalDate date2 = LocalDate.parse(str,format2);
        // System.out.println("日期类型:"+date2);

        String fileName = "c/fty/bd1c0f150e0d4fbc8618cb95ae590f27.jpg";
        String filenameExtension = StringUtils.getFilenameExtension(fileName);
        System.out.println(filenameExtension);
        String unqualify = StringUtils.unqualify(fileName);
        System.out.println(unqualify);
        
        // 解析路径字符串，解析出文件名部分
        String filename = StringUtils.getFilename(fileName);
        System.out.println(filename);


        Set<String> set = new HashSet<>();
        boolean add = set.add("1");
        System.out.println("add:" + add);
        boolean add1 = set.add("1");
        System.out.println("add:" + add1);
    }
}
