import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { DescricaoPage } from '../descricao/descricao';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) {

  }

  openDesciptions() {
    this.navCtrl.push(DescricaoPage);
  }

}
