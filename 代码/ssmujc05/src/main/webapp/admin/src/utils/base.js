const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmujc05/",
            name: "ssmujc05",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmujc05/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "图书馆自习室座位预约小程序"
        } 
    }
}
export default base
