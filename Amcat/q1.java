
class Solution {

    int difference_in_times(Time time1, Time time2) {
// write your code here
int sec1=(time1.hour*3600)+(time1.minute*60)+time1.second;
int sec2=(time2.hour*3600)+(time2.minute*60)+time2.second;

int diff=Math.abs(sec1-sec2);
return diff;

    }


