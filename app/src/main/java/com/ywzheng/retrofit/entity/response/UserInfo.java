package com.ywzheng.retrofit.entity.response;

import java.util.List;

/**
 * Created by yongwei on 2017/6/27.
 */

public class UserInfo {

    /**
     * msg : 登陆成功
     * msgModels : [{"code":"SYS_MSG","msgIcon":"","name":"系统消息"},{"code":"ORDER","msgIcon":"ison1","name":"订单"},{"code":"ORDER_RETURN","msgIcon":"ison2","name":"退货单"}]
     * msgOrgType : ent
     * orgId : HHYT00000000000000798650
     * orgLevel : 52
     * orgLevelName : 五星全线
     * orgName : 海虹测试企业_wy
     * orgtypes : [{"classId":"ENTMANG03","className":"器械","typeId":"ENT00130","typeName":"生产企业"},{"classId":"ENTMANG03","className":"器械","typeId":"EQU00131","typeName":"经营企业"},{"classId":"ENTMANG03","className":"器械","typeId":"ENT00132","typeName":"配送企业"},{"classId":"ENTMANG03","className":"器械","typeId":"ENT00131","typeName":"批发企业"}]
     * projectModels : [{"bidCode":"5","projectId":"PROJ00000000000003462848","projectName":"整体测试流程（勿动）"}]
     * resultCode : 200
     * serviceModels : [{"serviceCode":"20#10#10#60","serviceIcon":"image","serviceName":"产品查询"},{"serviceCode":"20#10#10#20","serviceIcon":"image","serviceName":"快速审核"},{"serviceCode":"20#10#10#40","serviceIcon":"image","serviceName":"电话服务"},{"serviceCode":"20#10#10#50","serviceIcon":"image","serviceName":"在线答疑"},{"serviceCode":"40#20#10#20","serviceIcon":"image","serviceName":"订单查询"},{"serviceCode":"40#20#10#30","serviceIcon":"image","serviceName":"条码使用"},{"serviceCode":"40#20#10#40","serviceIcon":"image","serviceName":"企业报码"},{"serviceCode":"40#20#10#50","serviceIcon":"image","serviceName":"条码规则"},{"serviceCode":"40#20#10#60","serviceIcon":"image","serviceName":"区域列表"},{"serviceCode":"20#10#10#10","serviceIcon":"image","serviceName":"注册证查询"}]
     * userId : DEMT00000000000000006837
     * userName : 海虹测试
     */

    private String msg;
    private String msgOrgType;
    private String orgId;
    private String orgLevel;
    private String orgLevelName;
    private String orgName;
    private int resultCode;
    private String userId;
    private String userName;
    private List<MsgModelsBean> msgModels;
    private List<OrgtypesBean> orgtypes;
    private List<ProjectModelsBean> projectModels;
    private List<ServiceModelsBean> serviceModels;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgOrgType() {
        return msgOrgType;
    }

    public void setMsgOrgType(String msgOrgType) {
        this.msgOrgType = msgOrgType;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgLevelName() {
        return orgLevelName;
    }

    public void setOrgLevelName(String orgLevelName) {
        this.orgLevelName = orgLevelName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<MsgModelsBean> getMsgModels() {
        return msgModels;
    }

    public void setMsgModels(List<MsgModelsBean> msgModels) {
        this.msgModels = msgModels;
    }

    public List<OrgtypesBean> getOrgtypes() {
        return orgtypes;
    }

    public void setOrgtypes(List<OrgtypesBean> orgtypes) {
        this.orgtypes = orgtypes;
    }

    public List<ProjectModelsBean> getProjectModels() {
        return projectModels;
    }

    public void setProjectModels(List<ProjectModelsBean> projectModels) {
        this.projectModels = projectModels;
    }

    public List<ServiceModelsBean> getServiceModels() {
        return serviceModels;
    }

    public void setServiceModels(List<ServiceModelsBean> serviceModels) {
        this.serviceModels = serviceModels;
    }

    public static class MsgModelsBean {
        /**
         * code : SYS_MSG
         * msgIcon :
         * name : 系统消息
         */

        private String code;
        private String msgIcon;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsgIcon() {
            return msgIcon;
        }

        public void setMsgIcon(String msgIcon) {
            this.msgIcon = msgIcon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class OrgtypesBean {
        /**
         * classId : ENTMANG03
         * className : 器械
         * typeId : ENT00130
         * typeName : 生产企业
         */

        private String classId;
        private String className;
        private String typeId;
        private String typeName;

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getTypeId() {
            return typeId;
        }

        public void setTypeId(String typeId) {
            this.typeId = typeId;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }
    }

    public static class ProjectModelsBean {
        /**
         * bidCode : 5
         * projectId : PROJ00000000000003462848
         * projectName : 整体测试流程（勿动）
         */

        private String bidCode;
        private String projectId;
        private String projectName;

        public String getBidCode() {
            return bidCode;
        }

        public void setBidCode(String bidCode) {
            this.bidCode = bidCode;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
    }

    public static class ServiceModelsBean {
        /**
         * serviceCode : 20#10#10#60
         * serviceIcon : image
         * serviceName : 产品查询
         */

        private String serviceCode;
        private String serviceIcon;
        private String serviceName;

        public String getServiceCode() {
            return serviceCode;
        }

        public void setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
        }

        public String getServiceIcon() {
            return serviceIcon;
        }

        public void setServiceIcon(String serviceIcon) {
            this.serviceIcon = serviceIcon;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "msg='" + msg + '\'' +
                ", msgOrgType='" + msgOrgType + '\'' +
                ", orgId='" + orgId + '\'' +
                ", orgLevel='" + orgLevel + '\'' +
                ", orgLevelName='" + orgLevelName + '\'' +
                ", orgName='" + orgName + '\'' +
                ", resultCode=" + resultCode +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", msgModels=" + msgModels +
                ", orgtypes=" + orgtypes +
                ", projectModels=" + projectModels +
                ", serviceModels=" + serviceModels +
                '}';
    }
}
