int centuryFromYear(int year) {

    return (int)(year / 100) + ((year % 100 == 0) ? 0 : 1);

}
