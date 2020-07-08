package enum_annotation;

public enum SeasonEnum implements EnumShow {
    SPRING("春天", "春风又绿江南岸") {
        @Override
        public void show() {
            //do something
        }
    },
    SUMMER("夏天", "映日荷花别样红") {
        @Override
        public void show() {
            //do something
        }
    },
    AUTUMN("秋天", "秋水共长天一色") {
        @Override
        public void show() {
            //do something
        }
    },
    WINTER("冬天", "窗含西岭千秋雪") {
        @Override
        public void show() {
            //do something
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("四季");
//    }
}