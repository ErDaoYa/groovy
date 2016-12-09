/**
 * @Description
 * @author zhaozhou
 * @date 2016/12/7
 */
def gettags = ("git ls-remote -t --refs ssh://git@gitlab.intra.gomeplus.com:21987/bs_admin_recharge/bs-service-permission.git").execute()

list =  gettags.text.readLines()
        .collect { it.split()[1].replaceAll('refs/tags/', '')  }
        .unique()
//        .reverse()
//        .findAll{!it.endsWith("^{}")}
println(list)