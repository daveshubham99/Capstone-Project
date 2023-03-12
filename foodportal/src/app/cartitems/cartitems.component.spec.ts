import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CARTITEMSComponent } from './cartitems.component';

describe('CARTITEMSComponent', () => {
  let component: CARTITEMSComponent;
  let fixture: ComponentFixture<CARTITEMSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CARTITEMSComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CARTITEMSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
