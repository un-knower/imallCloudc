/**
 * Created by lzx on 2017/4/27.
 */
import React, {PropTypes, Component} from "react";
import {bindActionCreators} from 'redux';
import {connect} from "react-redux";
import {BootstrapTable, TableHeaderColumn} from "react-bootstrap-table";
import {closeSupplierSelectWin,selectDate,changeCommonSupplierDocListState,loadCommonSupplierList} from '../actions';
import * as types from "../constants/ActionTypes";
import IMallPaginationBar from '../../imallpagination/components/IMallPaginationBar';
class SupplierSelectList extends Component {
    componentWillMount() {
        const {store} = this.context;
        this.props.loadCommonSupplierList(0, 10, store.getState().supplieDocComponentTodos.params);
    }

    /*添加选定的招商商品到已选招商列表*/
    selectConfirm() {
        const {store} = this.context;
        const {selectedContent} = store.getState().supplieDocComponentTodos;
        this.props.callBackFunction(selectedContent);
        this.props.closeSupplierSelectWin();
    }

    /*查询*/
    search() {
        const {store} = this.context;
        let params = store.getState().supplieDocComponentTodos.params;

        let [supplierNm, certificatesNum] = [this.refs.supplierNm.value,this.refs.certificatesNum.value];
        params.supplierNm = supplierNm;
        params.certificatesNum = certificatesNum;

        store.dispatch({
            type: types.COMMON_SUPPLIER_LIST_SET_PARAMS,
            params: params
        });
        this.props.loadCommonSupplierList(0, 100, params);
    }

    reset() {
        const {store} = this.context;
        this.refs.supplierNm.value = "";
        this.refs.certificatesNum.value = "";
        let params = {
            supplierNm: "",
            certificatesNum: "",
            page: 0,
            size: 10
        };
        store.dispatch({
            type: types.COMMON_SUPPLIER_LIST_SET_PARAMS,
            params:params
        });
    }




    onSizePerPageList(sizePerPage) {
        const {store} = this.context;
        let params = store.getState().supplieDocComponentTodos.params;
        this.props.loadCommonSupplierList(0, sizePerPage, params);
    }

    onPageChange(page, sizePerPage) {
        const {store} = this.context;
        let params = store.getState().supplieDocComponentTodos.params;
        this.props.loadCommonSupplierList(page - 1, sizePerPage, params);
    }

    renderShowsTotal(start, to, total) {
        return <span>共&nbsp;{total}&nbsp;条，每页显示数量</span>
    }

    render() {
        const {store} = this.context;

        const {changeCommonSupplierDocListState} = this.props;
        const page = store.getState().supplieDocComponentTodos.page;
        const supplierList = store.getState().supplieDocComponentTodos.page.content || [];
        const selectedId = this.context.store.getState().supplieDocComponentTodos.selectedId ||"";
        const number = page.number + 1;
        const options = {
            sizePerPage: page.size > 0 ? page.size : 10,
            sizePerPageList: page.totalElements > 0 ? [10, 20, 40] : [],
            pageStartIndex: 1,
            page: number,
            onPageChange: this.onPageChange.bind(this),
            onSizePerPageList: this.onSizePerPageList.bind(this),
            prePage: "上一页",
            nextPage: "下一页",
            firstPage: "<<",
            lastPage: ">>",
            dataTotalSize: page.totalElements,  //renderShowsTotal 中的共几条
            paginationSize: page.totalPages, //分页的页码
            paginationShowsTotal: page.totalElements > page.size ? this.renderShowsTotal : null,
            hideSizePerPage: page.totalElements <= page.size,
            isWindow:true
        };
        return (
            <div className="layer" style={{zIndex:"300"}}>
                <div className="layer-box layer-info layer-addsp w1075">
                    <div className="layer-header">
                        <span>添加供应商</span>
                        <a href="javascript:void(0);" className="close" onClick={()=>{changeCommonSupplierDocListState(false)}}></a>
                    </div>
                    <div className="layer-body">
                        <div className="md-box">
                            <div className="box-mc clearfix">
                                <div className="item">
                                    <label>供货单位名称<input  id="_supplierNm" ref="supplierNm"type="text"/></label>
                                </div>
                                <div className="item">
                                    <label>营业执照号<input id="_certificatesNum"type="text" ref="certificatesNum"/></label>
                                </div>
                                <a href="javascript:void(0);" className="green-btn" onClick={this.search.bind(this)}>查询</a>
                                <a href="javascript:void(0);" className="gray-btn"  onClick={this.reset.bind(this)}>重置</a>
                            </div>
                        </div>
                        <div className="md-box">
                            <div className="box-mc receiving-box clearfix">
                                <div className="item">
                                    <button style={{border:"none"}}  className="item-determine black-btn" href="javascript:void(0);" disabled={selectedId==""?true:false} onClick={this.selectConfirm.bind(this)}>确定选中</button>
                                </div>
                            </div>
                            <div className="box-mc">
                                <table className="w860">
                                    <thead>
                                    <tr>
                                        <th className="th-checkbox"><label></label></th>
                                        <th className="th-coding">序号</th>
                                        <th className="common-name">单位名称</th>
                                        <th className="taxation">注册地址</th>
                                        <th className="license">商品经营许可证号</th>
                                        <th className="license">营业执照号</th>
                                        <th className="license">法定代表人</th>
                                    </tr>
                                    </thead>
                                    { supplierList.length <= 0 &&
                                    <tbody><tr ><th colSpan="100" style={{textAlign:"center"}}>暂无数据</th></tr></tbody>
                                    }
                                    <tbody>
                                    {
                                        supplierList.map((supplier, index) => {
                                            return (
                                                <tr key={index}>
                                                    <td onClick={()=>{this.props.selectDate(supplier.id,supplier)}} >
                                                        <input type="checkbox" checked={supplier.id==selectedId?true:false} value="checkbox"/>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{index+1}</div>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{supplier.supplierNm}</div>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{supplier.regAddr}</div>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{supplier.commodityLicense}</div>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{supplier.businessLicense}</div>
                                                    </td>
                                                    <td>
                                                        <div className="td-cont">{supplier.legalRepresentative}</div>
                                                    </td>
                                                </tr>);
                                        })
                                    }
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                <IMallPaginationBar options={options} actions={this.props.actions}/>
                </div>
            </div>
        );
    }
}

SupplierSelectList.contextTypes = {
    store: React.PropTypes.object
};

function mapStateToProps(state) {
    return state;
}

function mapDispatchToProps(dispatch) {
    return bindActionCreators({
        loadCommonSupplierList,
        selectDate,
        closeSupplierSelectWin,
        changeCommonSupplierDocListState
    }, dispatch);
}

export default connect(mapStateToProps, mapDispatchToProps)(SupplierSelectList);